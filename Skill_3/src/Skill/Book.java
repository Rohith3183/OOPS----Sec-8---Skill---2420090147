package Skill;

public class Book 
{
	    private String title;
		private String author;
		private double price;
	    public void setTitle(String title) {
		    this.title = title;
		}
		public void setAuthor(String author) {
		    this.author = author;
		}
		public void setPrice(double price) {
		    this.price = price;
	    }
		public String getTitle() {
		    return title;
	    }
		public String getAuthor() {
		    return author;
		}
		public double getPrice() {
		    return price;
		}
		public String toString() {
		    return "Book \nTitle: " + title + "Author: " + author + "Price: " + price ;
		}
		public static void main(String[] args) {
		    Book book = new Book();
		    book.setTitle("Java Programming\n");
		    book.setAuthor("John Doe\n");
		    book.setPrice(49.99);
		    System.out.println(book);
	    }
	}
