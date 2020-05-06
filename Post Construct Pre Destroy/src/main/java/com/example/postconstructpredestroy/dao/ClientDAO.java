package com.example.postconstructpredestroy.dao;

import lombok.Getter;
import lombok.Setter;
import com.example.postconstructpredestroy.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Harvey Braun
 * @version 1.0
 * @since 19/04/2020
 */
@Component
@Getter @Setter
@Qualifier
public class ClientDAO {

	@Autowired
	private Client client;

	@PostConstruct
	public void postConstructor() {
		System.out.println("Objeto Criado na Memoria");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Objeto Finalizado");
	}

}
