package com.md.service.impl;

import com.md.mapper.TbItemCatMapper;
import com.md.pojo.TbItemCat;
import com.md.pojo.TbItemCatExample;
import com.md.service.ItemCatService;
import com.md.tools.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mengdong
 * @create 2018-11-12 17:36
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    TbItemCatMapper tbItemCatMapper;

    @Override
    public List<TreeNode> getItemCatList(long parentId) {
        //设置条件
        TbItemCatExample tbItemCatExample = new TbItemCatExample();
        TbItemCatExample.Criteria criteria = tbItemCatExample.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        //执行
        List<TbItemCat> tbItemCats = tbItemCatMapper.selectByExample(tbItemCatExample);
        //list t ot tree
        List<TreeNode> treeNodes = new ArrayList<>();
        for (TbItemCat tbItemCat : tbItemCats) {
            TreeNode node = new TreeNode(tbItemCat.getId(),
                    tbItemCat.getName(),
                    tbItemCat.getIsParent() ? "closed" : "open");
            treeNodes.add(node);
        }

        return treeNodes;
    }
}
