package com.itheima.service.impl;

import com.itheima.dao.ItemDao;
import com.itheima.domain.Item;
import com.itheima.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements ItemService {
    @Autowired
    private ItemDao dao;

    public Item findById(Integer id) {
        return dao.findById(id);
    }
}
