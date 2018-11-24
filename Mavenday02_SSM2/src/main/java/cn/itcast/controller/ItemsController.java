package cn.itcast.controller;

import cn.itcast.domain.Items;
import cn.itcast.services.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/showDetail")
    public String showDetile(Model model){

        Items item = itemsService.findById(2);
        //使用model将对象存入域对象
        model.addAttribute("item",item);

        return "itemDetail";
    }
}
