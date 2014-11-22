//********************************************************************
//  Book.java       Java Foundations
//
//  Solution to Programming Project 5.7
//********************************************************************
import java.util.Scanner;
  
public class Book
{
   private String title, author, isbn;
  
   
   //-----------------------------------------------------------------
   //  Sets up this Book object with the specified data.
   //-----------------------------------------------------------------
   public void Book ()
   {
     
   }

   //-----------------------------------------------------------------
   //  Accessors.
   //-----------------------------------------------------------------
   public String getTitle()
   {
      return title;
   }

   public String getAuthor()
   {
      return author;
   }

   public String getIsbn()
   {
      return isbn;
   }


   //-----------------------------------------------------------------
   //  Mutators.
   //-----------------------------------------------------------------
   Scanner input = new Scanner(System.in);
 
   public void setTitle ()
   {
   
     System.out.println("Enter the title of the book: ");
     title = input.nextLine();
     
   }

   public void setAuthor ()
   {
   
     System.out.println ("Enter the name of the author(s): ");
      author = input.nextLine();
      
   }

   public void setIsbn ()
   {
   
     System.out.println ("Now enter the ISBN code: ");
     isbn = input.nextLine();
     
   }

   //-----------------------------------------------------------------
   //  Returns a string representation of this book.
   //-----------------------------------------------------------------
   public String toString ()
   {
      return isbn+ ", " + author + "." + title;
   }
}