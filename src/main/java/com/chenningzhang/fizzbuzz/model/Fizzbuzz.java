package com.chenningzhang.fizzbuzz.model;

import java.util.List;

/**
 * 
 * @author ChenningZhang
 * The model used for the return type of the Application Controller method.
 * status: "error" if required request param is missing or invalid; "ok" if all good.
 * numbers: An array of integers from 1(included) to param max_value(included) that are:
 *    divisible by 3: if param word is "fizz";
 *    divisible by 5: if param word is "buzz";
 *    divisible by 3 and 5: if param word is "fizzbuzz"
 *    
 */

public class Fizzbuzz {
	String status;
	
	List<Integer> numbers;
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}

	@Override
	public String toString() {
		return "Fizzbuzz [status=" + status + ", numbers=" + numbers + "]";
	}
	
}
