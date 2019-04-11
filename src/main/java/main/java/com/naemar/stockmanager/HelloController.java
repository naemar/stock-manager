package main.java.com.naemar.stockmanager;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/stockmanager/currentTime")
	public String hello() {
		return "Hello, the time at the server is now " + new Date() + "\n";
	}
}
