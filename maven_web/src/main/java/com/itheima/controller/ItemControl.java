package com.itheima.controller;

import com.itheima.domain.Item;
import com.itheima.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
public class ItemControl {
    @Autowired
    private ItemService service;

    @RequestMapping("/findItem")
    public String findItem(Model model) {
        Item item = service.findById(1);
        //System.out.println(item);
        model.addAttribute(item);
        return "itemDetail";
    }
}
