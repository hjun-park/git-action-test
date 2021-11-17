package com.example.demo.src.test.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@DynamicInsert    // DB 기본값 적용시키기 위함
@Table(name = "TEST")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TestDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String name;

	@NotNull
	private int number;

	@Builder
	public TestDTO(String name, int number) {
		this.name = name;
		this.number = number;
	}
}
