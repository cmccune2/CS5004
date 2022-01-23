/**
 * Chris McCune
 * This is a Book class. A book has a title, author, and illustrator
 */

public class Book {
  private String title;
  private String author;
  private boolean illustrator;

  /**
   * This is a contructor for the Book class.
   * @param title
   * @param author
   * @param illustrator
   */

  public Book(String title, String author, boolean illustrator){
    this.title = title;
    this.author = author;
    this.illustrator = illustrator;


  public String getTitle(){return this.title;}
  public String getAuthor(){return this.author;}
  public boolean isIllustrator(){return this.illustrator;}

  }
}
