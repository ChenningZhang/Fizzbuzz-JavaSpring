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
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
		
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@ResponseBody
	@RequestMapping(value = "/api", method = RequestMethod.GET)
	public ResponseEntity<Fizzbuzz> fizzbuzz(@RequestParam(required=false, defaultValue="") String word, @RequestParam(required=false, defaultValue="0") String max_value) throws Exception {
		Fizzbuzz result = new Fizzbuzz();
		List<Integer> lst = new ArrayList<Integer>();
		if((!word.equals("fizz") && !word.equals("buzz") && !word.equals("fizzbuzz")) || Integer.valueOf(max_value) <= 0) {
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
