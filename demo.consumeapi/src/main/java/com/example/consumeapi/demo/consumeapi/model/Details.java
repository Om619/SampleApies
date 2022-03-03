package com.example.consumeapi.demo.consumeapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Details {
	private String userId;
	private int id;
	private String title;
	@JsonProperty("complete")
	private boolean body;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean getBody() {
		return body;
	}
	public void setBody(boolean body) {
		this.body = body;
	}
	public Details(String userId, int id, String title, boolean body) {
		super();
		this.userId = userId;
		this.id = id;
		this.title = title;
		this.body = body;
	}
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Details [userId=" + userId + ", id=" + id + ", title=" + title + ", body=" + body + "]";
	}

}
