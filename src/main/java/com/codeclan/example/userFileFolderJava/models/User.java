package com.codeclan.example.userFileFolderJava.models;

import java.util.ArrayList;
import java.util.List;

public class User {

	private long id;
	private String name;
	private List<Folder> folders;

	public User(String name) {
		this.name = name;
		this.folders = new ArrayList<>();
	}

	public void User(){
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Folder> getFolders() {
		return folders;
	}

	public void setFolders(List<Folder> folders) {
		this.folders = folders;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
