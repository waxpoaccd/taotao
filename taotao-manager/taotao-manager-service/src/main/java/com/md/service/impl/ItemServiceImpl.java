package com.md.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.md.mapper.TbItemCatMapper;
import com.md.mapper.TbItemMapper;
import com.md.pojo.TbItem;
import com.md.pojo.TbItemExample;
import com.md.service.ItemService;
import com.md.tools.EUDataGridResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mengdong
 * @create 2018-11-11 21:38
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    @Autowired
    private TbItemCatMapper tbItemCatMapper;

    @Override
    public TbItem getItemById(Long itemId) {
        return tbItemMapper.selectByPrimaryKey(itemId);
    }

    @Override
    public EUDataGridResult getItemList(int page, int rows) {
        //查询列表
        TbItemExample tbItemExample = new TbItemExample();
        //分页查询
        PageHelper.startPage(page, rows);
        List<TbItem> list = tbItemMapper.selectByExample(tbItemExample);
        EUDataGridResult result = new EUDataGridResult();
        result.setRows(list);
        //取total
        PageInfo<TbItem> pageInfo = new PageInfo<>(list);
        result.setTotal(pageInfo.getTotal());
        return result;
    }

}
