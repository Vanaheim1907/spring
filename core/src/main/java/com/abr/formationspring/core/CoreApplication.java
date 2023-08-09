package com.abr.formationspring.core;

import com.abr.formationspring.core.controller.MovieController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CoreApplication.class, args);

		MovieController controller = new MovieController();
		controller.addUsingConsole();
	}

}
