//********************************************************************
//  Book.java       Java Foundations
//
//  Solution to Programming Project 5.7
//********************************************************************

  
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

 
   public void setTitle (String t)
   {
   
    // System.out.println("Enter the title of the book: ");
     title = t;
     
   }

   public void setAuthor (String a)
   {
   
   //  System.out.println ("Enter the name of the author(s): ");
      author = a;
   }

   public void setIsbn (String i)
   {
   
   //  System.out.println ("Now enter the ISBN code: ");
     isbn = i;
     
   }

   //-----------------------------------------------------------------
   //  Returns a string representation of this book.
   //-----------------------------------------------------------------
   public String toString ()
   {
      return isbn  + "," + author + "."  + title;
   }
}