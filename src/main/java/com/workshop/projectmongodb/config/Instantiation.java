package com.workshop.projectmongodb.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.workshop.projectmongodb.domain.User;
import com.workshop.projectmongodb.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	

		@Autowired
		private UserRepository userReposiroty;

		@Override
		public void run(String... arg0) throws Exception {
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
			
			userReposiroty.deleteAll();
						
			User maria = new User(null, "Maria Brown", "maria@gmail.com");
			User alex = new User(null, "Alex Green", "alex@gmail.com");
			User bob = new User(null, "Bob Grey", "bob@gmail.com");
			
			userReposiroty.saveAll(Arrays.asList(maria, alex, bob));
		}
	
}
