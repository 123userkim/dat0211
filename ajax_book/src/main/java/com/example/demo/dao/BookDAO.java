package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.DBManager;
import com.example.demo.vo.BookVO;

@Repository
public class BookDAO {
	public List<BookVO> findAll(){
		return DBManager.findAll();
	}
	
	public List<String> findPublisher() {
		return DBManager.listPublisher();
	}

	public List<BookVO> findByPublisher(String publisher) {
		// TODO Auto-generated method stub
		return DBManager.findByPublisher(publisher);
	}
}
