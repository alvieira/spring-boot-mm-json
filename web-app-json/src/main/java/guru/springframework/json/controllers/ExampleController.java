package guru.springframework.json.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.json.model.ShippingAddress;

@RestController
public class ExampleController {
	
	@RequestMapping("/")
	public ShippingAddress getShippingAddress() {
		return new ShippingAddress();
	}

}
