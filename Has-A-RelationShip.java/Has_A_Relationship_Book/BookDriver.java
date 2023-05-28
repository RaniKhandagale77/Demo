package com.jsp.Has_A_Relationship_Book;

public class BookDriver {

	public static void main(String[] args) {
		Book b=new Book("Indian History","Gk",300);
		b.setAuthor(new Author("palestine","xyz",978));
		b.getAuthor().setAddress(new Address("vashi","Mumbai","Maharastra"));
		b.printBookDetails();

	}

}
