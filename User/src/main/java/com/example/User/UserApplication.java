package com.example.User;

import java.sql.Connection;
import java.sql.SQLException;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		Connection connection = null;
		try {
		  //  connection = Data.getConnection();
		} finally {
		    if (connection != null) try { connection.close(); } catch (SQLException ignore) {}
		}
		SpringApplication.run(UserApplication.class, args);
	}
	

}
