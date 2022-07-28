package com.dto;

public class Main {
	public static void main(String[] args) {
		DTO dto = new DTO();
		dto.setLogin("login");
		dto.setPassword("pass");
		dto.setTimestamp(256L);

		System.out.println(dto);
	}
}
