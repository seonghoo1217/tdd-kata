package application_model.entity;


public class User {
	private String username;
	private int win;
	private int lose;
	public User(String username,int win,int lose) {
		this.username = username;
		this.win=win;
		this.lose=lose;
	}
}
