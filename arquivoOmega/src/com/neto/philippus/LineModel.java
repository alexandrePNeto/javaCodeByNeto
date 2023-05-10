package com.neto.philippus;

public class LineModel 
{
	private int		id;
	private	String 	content;
	private String	bollContent;
	private	int		countCaracters;
	
	public String getBollContent() {
		return bollContent;
	}
	public void setBollContent(String bollContent) {
		this.bollContent = bollContent;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCountCaracters() {
		return countCaracters;
	}
	public void setCountCaracters(int countCaracters) {
		this.countCaracters = countCaracters;
	}
	
}	//	LineModel