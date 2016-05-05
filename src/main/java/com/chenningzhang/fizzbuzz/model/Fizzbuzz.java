package com.chenningzhang.fizzbuzz.model;

import java.util.List;

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
