package com.fabyanjos.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fabyanjos.app.model.Item;
import com.fabyanjos.app.service.ItemService;

@Controller
public class TestResource {
	
	@Autowired 
	ItemService itemService;

	@RequestMapping(value="/rest/helloworld", produces={"text/plain"})
	@ResponseBody
	public String getMsg() {
        List<Item> allItem = itemService.getAllItens();
        for (Item u : allItem)
        {
            System.out.println(u);
        }
        Item Item = new Item(null, "product 01", 10.0);
        Integer id = itemService.createItem(Item);
        System.out.println("Newly created Item Id="+id);
        allItem = itemService.getAllItens();
        for (Item u : allItem)
        {
            System.out.println(u);
        }
		// Return some cliched textual content
		return "Hello World Rest";
	}
}
