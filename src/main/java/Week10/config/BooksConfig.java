package Week10.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Week10.Beans.Books;

/**
 * @author Itsal - Quinn Birdsley
 * CIS175 - Fall 2021
 * Oct 30, 2023
 */
@Configuration
public class BooksConfig {
	@Bean
	public Books books() {
		Books books = new Books();
		return books;
	}

}
