package com.example.Bookstore.web;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Bookstore.domain.Book;

@Controller
@ResponseBody

public class BookController {
	
	@GetMapping("/")
	public String index () {
		return "Bookstore";
	}
  
}

