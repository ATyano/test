package src.trip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import src.trip.model.MessageInterface;

@Controller
public class MessageApiController {
	
	@Autowired
	MessageInterface messObj;
	
	@GetMapping("/mess")
	public String messageApi() {

		messObj.message();
		
		return "";
		
	}

}
