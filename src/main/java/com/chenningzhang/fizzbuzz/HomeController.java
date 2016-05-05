package com.chenningzhang.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenningzhang.fizzbuzz.model.Fizzbuzz;

/**
 * Handles requests for the application.
 * @param word(required): One of "fizz", "buzz", or "fizzbuzz"
 * @param max_value(required): An Integer greater than 0.
 * URI: /api
 * Example URL: /api?word=fizz&max_value=30
 * HTTP status: 400 if required param is missing or invalid; 200 otherwise.
 */
@Controller
public class HomeController {

	@ResponseBody
	@RequestMapping(value = "/api", method = RequestMethod.GET)
	public ResponseEntity<Fizzbuzz> fizzbuzz(@RequestParam(required=false, defaultValue="") String word, @RequestParam(required=false, defaultValue="0") String max_value) throws Exception {
		Fizzbuzz result = new Fizzbuzz();
		List<Integer> lst = new ArrayList<Integer>();
		try {
			if((!word.equals("fizz") && !word.equals("buzz") && !word.equals("fizzbuzz")) || Integer.valueOf(max_value) <= 0 || Integer.valueOf(max_value) != (int)Integer.valueOf(max_value)) {
				result.setStatus("error");
				result.setNumbers(lst);
				return new ResponseEntity<Fizzbuzz>(result, HttpStatus.BAD_REQUEST);
			}
		} catch (NumberFormatException e) {
			result.setStatus("error");
			result.setNumbers(lst);
			return new ResponseEntity<Fizzbuzz>(result, HttpStatus.BAD_REQUEST);
		}
		
		result.setStatus("ok");
		
		for(int i=1; i<=Integer.valueOf(max_value); i++) {
			if(word.equals("fizzbuzz") && i % 15 == 0) {
				lst.add(i);
			} else if(word.equals("fizz") && i % 3 == 0) {
				lst.add(i);
			} else if(word.equals("buzz") && i % 5 == 0) {
				lst.add(i);
			}
		}
		result.setNumbers(lst);
		
		return new ResponseEntity<Fizzbuzz>(result, HttpStatus.OK);
	}
	
}
