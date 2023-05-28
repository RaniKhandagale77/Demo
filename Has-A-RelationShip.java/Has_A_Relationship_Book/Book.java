package com.jsp.Has_A_Relationship_Book;

public class Book {
	private String name;
	private String genre;
	private int price;
	private Author author;
	
	Book(String name,String genre,int price){
		this.name=name;
		this.genre=genre;
		this.author=author;
		
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public void printBookDetails() {
		System.out.println(name);
		System.out.println(genre);
		System.out.println(price);
		
		if(author!=null) {
			author.printAuthorDetails();
		}else {
			System.out.println("Author Details Not Mentions");
		}
	}

}
