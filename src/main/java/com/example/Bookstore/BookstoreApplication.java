package com.example.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Bookstore.domain.Book;
import com.example.Bookstore.domain.BookRepository;
import com.example.Bookstore.domain.Category;
import com.example.Bookstore.domain.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	//Command line runner:
	@Bean
	public CommandLineRunner demo(BookRepository repository, CategoryRepository repository2) {
		return (args) -> {
			repository2.save(new Category("Horror"));
			repository2.save(new Category("Romance"));
			repository2.save(new Category("Comedy"));
		

			repository.save(new Book ("Pride and Prejudice", "Jane Austen", "1813", " 978-951-98548-9-2", "20,90", repository2.findByName("Horror").get(0)));
			repository.save(new Book("Sense and Sensibility ", "Jane Austen", "1811", " 978-951-98548-9-5", "20,90", repository2.findByName("Romance").get(0)));
			repository.save(new Book("Emma", "Jane Austen", "1815", " 978-951-98545-9-2", "20,90",repository2.findByName("Comedy").get(0)));
		
	
		};
		
	}
	
}
