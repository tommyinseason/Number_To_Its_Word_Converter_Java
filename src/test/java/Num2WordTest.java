import org.junit.*;
import static org.junit.Assert.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;


public class Num2WordTest {

  @Test
  public void convertToWord_convertSingleDigitToString_One() {
    Num2Word testNum2Word = new Num2Word();
    assertEquals("nineteen", testNum2Word.convertToWord("18"));
  }

  @Test
  public void convertToWord_convert20to99toDigitToString_21() {
    Num2Word testNum2Word = new Num2Word();
    assertEquals("twenty one", testNum2Word.convertToWord("21"));
  }
}
