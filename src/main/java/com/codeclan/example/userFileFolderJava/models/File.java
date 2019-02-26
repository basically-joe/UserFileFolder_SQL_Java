package com.codeclan.example.userFileFolderJava.models;

public class File {

	private long id;
	private String name;
	private String extension;
	private int size;
	private int folder;

	public File(String name, String extension, int size, int folder) {
		this.name = name;
		this.extension = extension;
		this.size = size;
		this.folder = folder;
	}

	public void File(){
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getFolder() {
		return folder;
	}

	public void setFolder(int folder) {
		this.folder = folder;
	}
}
