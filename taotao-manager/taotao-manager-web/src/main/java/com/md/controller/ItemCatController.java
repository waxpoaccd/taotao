package com.md.controller;

import com.md.service.ItemCatService;
import com.md.tools.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 商品分类
 * @author mengdong
 * @create 2018-11-12 17:48
 */
@Controller
@RequestMapping("/item/cat")
public class ItemCatController {

    @Autowired
    ItemCatService itemCatService;

    @ResponseBody
    @RequestMapping("/list")
    public List<TreeNode> getItemCatList(@RequestParam(value = "id",defaultValue = "0") Long parentId) {
        return itemCatService.getItemCatList(parentId);
    }
}
