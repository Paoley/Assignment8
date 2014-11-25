//********************************************************************
//  Bookshelf.java       Java Foundations
//
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
              data = data + "," + input.nextLine();
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
   
  /////////////////////////////////////////////////////// 
   public Book getBook()
   {
     Scanner input2 = new Scanner (System.in);
     System.out.println ("please type the ISBN of the book you wish to find");
     String x = input2.nextLine();
     //Scanner data2 = new Scanner (x);
     int locationInArray = 0;
     
     for (int i=0;i<5;i++)
     {
       //String search = data2.nextLine();
       if (x.equals(books[i].getIsbn()))
       {
         locationInArray = i;
         System.out.println (books[i]);
       } 
       else
       {
         if((books[i].getTitle() + books[i].getAuthor()).equals(x))
           locationInArray = i;
           System.out.println (books[i]);
       }
     }
    
     return books[locationInArray];
   }
   
   //*************************************************
   // We assume we need to print the Titla and the author in alphabetical order based on the instructions for part C.
   //*************************************************
   
   public void getFirstTitleAndAuthor(){
     System.out.println ( books[0].getTitle() );
     if ((books[0].getTitle().compareToIgnoreCase(books[0].getAuthor())) > 0)
       System.out.println (books[0].getTitle() + " " + books[0].getAuthor());
       
   }
   
   public Book getBook(int bookNumber){
     return books[bookNumber];
   }
   
  }
