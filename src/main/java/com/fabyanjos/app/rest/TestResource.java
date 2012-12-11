package com.fabyanjos.app.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.fabyanjos.app.ResponseError;
import com.fabyanjos.app.model.Item;
import com.fabyanjos.app.model.ListItem;
import com.fabyanjos.app.service.ItemService;

@Controller
public class TestResource {
	
	@Autowired 
	ItemService itemService;

	@RequestMapping(value="/rest/item", produces={"application/xml", "application/json"}, method = RequestMethod.GET)
	@ResponseBody
	public ListItem getMsg() {
		ListItem listItem = new ListItem(itemService.getAllItens());
        for (Item u : listItem.getItem())
        {
            System.out.println(u);
        }
//        Item item = new Item(null, "product 01", 10.0);
//        Integer id = itemService.createItem(item);
//        System.out.println("Newly created Item Id="+id);
        
		return listItem;
	}
	
	@ResponseStatus(value = HttpStatus.CREATED)
	@ResponseBody
	@RequestMapping(value = "/rest/item", method = RequestMethod.POST)
	public void createItem(HttpServletRequest req, HttpServletResponse resp, 
			@RequestParam(value = "name") String name, @RequestParam(value = "value") Double value) {
		Item item = new Item(null, name, value);
		itemService.createItem(item);
		String location = req.getRequestURL().toString() + "/" + item.getId();
		resp.addHeader("Location", location);
		
	}
	
	@ResponseBody
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MissingServletRequestParameterException.class)
	@RequestMapping(produces={"application/xml", "application/json"})
	public ResponseError missingServletRequestParameterException(MissingServletRequestParameterException exception) {
		ResponseError error = new ResponseError(exception.getParameterName(), "Missing field :" + exception.getParameterName());
		return error;
	}
}
