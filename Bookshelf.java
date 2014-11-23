//********************************************************************
//  Bookshelf.java       Java Foundations
//
//  Solution to Programming Project 5.7
//********************************************************************
import java.io.*;
import java.util.Scanner;

public class Bookshelf
{
  private final int numberOfBooks=5;
  private Book books[];
   public Bookshelf ()
   {
      String data = "";
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter the title of the book, the author name, and the corresponding ISBN number ");
       data = data + input.nextLine();
      
      for(int i = 0; 4 > i; i++)
            {
              System.out.println("Enter the title of the book, the author name, and the corresponding ISBN number ");
              data = data +"," + input.nextLine();
            }
      System.out.println(data);
      input = new Scanner (data);
      input.useDelimiter(",");
     
       books = new Book[numberOfBooks];   
      Book booker = new Book ();
      
      
     
      for(int i = 0; 5 > i; i++)
      {
        books[i] = new Book();
        books[i].setTitle(input.next());
        books[i].setAuthor(input.next());
        books[i].setIsbn(input.next());
        System.out.println(books[i]);
        
      }
      
      
    System.out.println ("Your books are the following: " + books[0] + " " + books[1] + " " + books[2] + " " + books[3] + " " + books[4]);
      }
   public Book getBook(String isbn)
   {
     int i = 0;
    
     while ( !(books[i].getIsbn().equals(isbn))
           ||
            !((books[i].getAuthor() + books[i].getTitle()).equals(isbn)))
     {
       i++;
     }
     return books[i];
   }
  }
