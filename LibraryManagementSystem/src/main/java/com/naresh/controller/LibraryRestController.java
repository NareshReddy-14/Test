package com.naresh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.naresh.exception.BookNotFoundException;
import com.naresh.model.Books;
import com.naresh.model.Member;
import com.naresh.repository.BooksRepository;
import com.naresh.repository.MemberRepository;

@RestController
public class LibraryRestController {
	
	@Autowired
	BooksRepository booksRepository;
	
	@Autowired
	MemberRepository memberRepository;
	
	@PostMapping("/addbooks")
	Books newBooks(@RequestBody Books books) {
		return booksRepository.save(books);
	}
	
	@GetMapping("/allbooks")
	  List<Books> allBooks() {
	    return booksRepository.findAll();
	  }
	
	@GetMapping("/books/{id}")
	  Books one(@PathVariable int id) {
	    return booksRepository.findById(id)
	      .orElseThrow(() -> new BookNotFoundException(id));
	  }
	
	
	@PostMapping("/addmember")
	Member newMemebers(@RequestBody Member member) {
		return memberRepository.save(member);
	}
	
	@GetMapping("/allMemebers")
	  List<Member> allMembers() {
	    return memberRepository.findAll();
	  }

}
