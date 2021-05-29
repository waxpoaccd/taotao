package com.md.controller;

import com.md.pojo.TbItem;
import com.md.service.ItemService;
import com.md.tools.EUDataGridResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author mengdong
 * @create 2018-11-11 21:41
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;



    @ResponseBody
    @RequestMapping("/item/{itemId}")
    public TbItem getItemById(@PathVariable Long itemId) {
        TbItem tbItem = itemService.getItemById(itemId);
        return tbItem;
    }

    @ResponseBody
    @RequestMapping("item/list")
    public EUDataGridResult getItemList(Integer page,Integer rows){
        EUDataGridResult result = itemService.getItemList(page, rows);
        return result;
    }
}
