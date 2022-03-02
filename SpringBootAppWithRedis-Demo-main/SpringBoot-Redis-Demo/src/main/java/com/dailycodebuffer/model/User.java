package com.dailycodebuffer.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash("Product")
public class User implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private int age;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    
    
}
