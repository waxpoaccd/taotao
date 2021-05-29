package com.md.service;

import com.md.pojo.TbItem;
import com.md.tools.EUDataGridResult;

/**
 * @author mengdong
 * @create 2018-11-11 21:30
 */
public interface ItemService {
    TbItem getItemById(Long itemId);

    EUDataGridResult getItemList(int page, int rows);
}
