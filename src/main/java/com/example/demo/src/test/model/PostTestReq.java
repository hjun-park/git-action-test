package com.example.demo.src.test.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PostTestReq {

	@NotNull
	private int number;

	@NotNull
	private String name;

	public PostTestReq(int number, String name) {
		this.number = number;
		this.name = name;
	}
}
