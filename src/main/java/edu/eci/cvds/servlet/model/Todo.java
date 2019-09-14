package edu.eci.cvds.servlet.model;

public class Todo {
	private int userId;
	private int id;
	private String title;
	private boolean completed;
	
	public Todo() {
		
	}
	
	public int getUserId() {
		return userId;
		// TODO Auto-generated method stub

	}
	
	public int getId() {
		return id;
		// TODO Auto-generated method stub

	}

	public String getTitle() {
		return title;
		// TODO Auto-generated method stub

	}

	public boolean getCompleted() {
		return completed;
		// TODO Auto-generated method stub

	}
	
	public void setUserId(int userId) {
		this.userId = userId;

	}
	
	public void setId(int id) {
		this.id = id;

	}

	public void setTitle(String title) {
		this.title = title;

	}

	public void setCompleted(boolean completed) {
		this.completed = completed;

	}
	
	
}
