/**
 * Chris McCune
 * This is a Person class. A person class has a fn, ln, yob, married status
 *
 */
public class Person {
  private String firstName;
  private String lastName;
  private int yob;
  private boolean status;

  /**
   * This is a constructor for the person class.
   * @param fn first name as a String
   * @param ln last name as a String
   * @param YOB YOB as an int
   * @param ms married status as a bool
   */
  public Person(String fn, String ln, int YOB, boolean ms){
    this.firstName = fn;
    this.lastName = ln;
    this.yob = YOB;
    this.status = ms;

  }


  public String getFirstName(){
    return this.firstName;
  }

  public int getYOB(){
    return this.yob;
  }

  public boolean isMarried(){
    return this.status;
  }

}
