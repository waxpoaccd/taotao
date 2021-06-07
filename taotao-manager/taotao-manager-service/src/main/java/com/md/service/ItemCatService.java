package com.md.service;

import com.md.tools.TreeNode;

import java.util.List;

/**
 * 商品分类
 *
 * @author mengdong
 * @create 2018-11-12 17:35
 */
public interface ItemCatService {
    List<TreeNode> getItemCatList(long parentId);
}
