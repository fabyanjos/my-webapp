package com.fabyanjos.app.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;

import com.fabyanjos.app.model.Item;
import com.fabyanjos.app.service.ItemService;

@Path("/helloworld")
public class TestResource {
	
	@Autowired 
	ItemService itemService;

	// The Java method will process HTTP GET requests
	@GET
	// The Java method will produce content identified by the MIME Media
	// type "text/plain"
	@Produces("text/plain")
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
		return "Hello World Jersey";
	}
}
