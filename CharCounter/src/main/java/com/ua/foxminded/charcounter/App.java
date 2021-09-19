package com.ua.foxminded.charcounter;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    while (true) {
      System.out.print("Сount characters in a string? (no - break)\n");
      Scanner in = new Scanner(System.in);
      String sentence = in.nextLine();
      if (sentence.equals("no")) {
        break;
      }
      CharCounter counterChar = new CharCounter();
      CharsCount counterChars = counterChar.getCharsCount(sentence);
      CounterPrinter.print(counterChars);
    }
  }

}
