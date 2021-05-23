package com.md.service.impl;

import com.md.mapper.TbItemMapper;
import com.md.pojo.TbItem;
import com.md.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mengdong
 * @create 2018-11-11 21:38
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public TbItem getItemById(Long itemId) {
        return tbItemMapper.selectByPrimaryKey(itemId);
    }
}
