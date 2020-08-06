package com.naresh.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Books {
	
	@Id
	@GeneratedValue
	private int bookId;
	private String  nameOfBook;
	private String authorName;
	private int noOfBooks;
	
	

}
