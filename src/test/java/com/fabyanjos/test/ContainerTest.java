package com.fabyanjos.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fabyanjos.app.model.Item;
import com.fabyanjos.app.service.ItemService;

public class ContainerTest {

	public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.scan("com.fabyanjos.app.spring.context");//This will load the configured components ItemService, ItemRepository,
        ctx.refresh();
        System.out.println(ctx);
        ItemService itemService = ctx.getBean(ItemService.class);
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
    }
}
