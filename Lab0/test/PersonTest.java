
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;


public class PersonTest {
  private Person p1;

  @Before
  public void setup(){

  p1 = new Person( "Chef",  "McP",  1999, false);
  }

  @Test
  public void testGetFirstName(){
    assertEquals("Chef", p1.getFirstName());
    assertNotEquals("Smith", p1.getFirstName());
  }

  @Test
  public void testYOB(){
    assertEquals(1999, p1.getYOB());
  }

  @Test
  public void testStatus(){
    assertFalse(p1.isMarried());
  }

}
