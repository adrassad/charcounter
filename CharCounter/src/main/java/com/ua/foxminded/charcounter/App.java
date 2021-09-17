package com.ua.foxminded.charcounter;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String sentence = in.nextLine();
    CharCounter counterChar = new CharCounter();
    CounterChars counterChars = counterChar.generateCounterChars(sentence);
    CounterPrinter printer = new CounterPrinter();
    printer.print(counterChars);
  }

}
