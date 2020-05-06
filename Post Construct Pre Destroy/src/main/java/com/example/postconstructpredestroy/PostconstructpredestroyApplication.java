package com.example.postconstructpredestroy;

import com.example.postconstructpredestroy.dao.ClientDAO;
import com.example.postconstructpredestroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Harvey Braun
 * @version 1.0
 * @since 19/04/2020
 */
@SpringBootApplication
public class PostconstructpredestroyApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(PostconstructpredestroyApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

		clientDAO.setClient(new Client("Mario Silveira"));

		System.out.println("Objeto ClientDAO: " + clientDAO);
		System.out.println("Objeto Client dentro do ClientDAO: " + clientDAO.getClient());

	}

}
