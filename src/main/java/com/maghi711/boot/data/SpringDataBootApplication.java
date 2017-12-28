package com.maghi711.boot.data;

import com.maghi711.boot.data.entities.Book;
import com.maghi711.boot.data.repo.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;
import java.util.Date;

@SpringBootApplication
public class SpringDataBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataBootApplication.class, args);
		BookRepository repository = context.getBean(BookRepository.class);

		Book book = new Book();
		book.setTitle("Spring Data Boot");
		book.setPageCount(200);
		book.setPublishDate(new Date());
		book.setPrice(new BigDecimal(400.00));

		repository.save(book);
		System.out.println("persisted " + book);
	}
}
