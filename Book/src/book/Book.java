
package book;
public class Book {

    //Data members/Variables
    private String title;
    private String Author;
    private int isbn;
    private String category;
    //constructor
    public Book(){
    
        title = "";
        Author = "";
        isbn = 0;
        category = "";
        
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }
    
    public void setTitle(String title){
        this.title = title;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return Author;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getCategory() {
        return category;
    }
    
    public void display(){
        System.out.println("Author: "+Author);
    }
}
