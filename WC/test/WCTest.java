import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WCTest{
  @Test
  public void should_give_all_character_of_give_text(){
    String text = "Hello what are you doing";
    WC wc = new WC(text);
    assertEquals(24,wc.charLength());
  }

  @Test
  public void should_give_all_words_of_given_text(){
    String text = "Hello what are you doing";
    WC wc = new WC(text);
    assertEquals(5, wc.words());
  }

  @Test
  public void should_give_lines_of_given_text(){
    String text = "Hello what are you doing"+"\n"+"Are you doing some specific works";
    WC wc = new WC(text);
    assertEquals(2, wc.lines());
  }
}
