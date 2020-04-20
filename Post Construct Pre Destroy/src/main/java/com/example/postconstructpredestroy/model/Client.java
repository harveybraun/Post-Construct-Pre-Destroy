package com.example.postconstructpredestroy.model;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * @author Harvey Braun
 * @version 1.0
 * @since 19/04/2020 - 23:00
 */
@Component
@Getter @Setter
@AllArgsConstructor
@ToString
public class Client {

	private String name;

	public Client() {
		System.out.println("Passou Pelo Construtor de Client");
	}
}
