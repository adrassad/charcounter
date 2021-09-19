package com.ua.foxminded.charcounter;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

public class CharCounterTest {

  @Test
  public void testHelloWorld() {
    CharCounter counterChar = new CharCounter();
    CharsCount counterChars = counterChar.getCharsCount("hello world");
    assertEquals(
        "\"h\" - 1\n" + "\"e\" - 1\n" + "\"l\" - 3\n" + "\"l\" - 3\n" + "\"o\" - 2\n" + "\" \" - 1\n" + "\"w\" - 1\n"
            + "\"o\" - 2\n" + "\"r\" - 1\n" + "\"l\" - 3\n" + "\"d\" - 1\n" + "",
        CounterPrinter.formatCounterChars(counterChars));
  }
  
  @Test
  public void testCountWord() {
    CharCounter counterChar = new CharCounter();
    CharsCount counterChars = counterChar.getCharsCount("hello world");
    Map<Character, Integer> uniqueCharsString = counterChars.getUniqueCharsString();
    int count = uniqueCharsString.get('o');
    assertEquals(2, count);
  }

}
