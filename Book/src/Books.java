
import book.Book;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mosal
 */
public class Books {
    
    public static void main(String []args){
        
        Scanner kb = new Scanner(System.in);
        
        
        
        System.out.print("Please enter name of the author: ");
        String authorName = kb.nextLine();
        
        Book b1 = new Book();
        
        b1.setAuthor(authorName);
        
        b1.display();
        
        
    }
}
