package com.ua.foxminded.charcounter;

import java.util.HashMap;
import java.util.Map;

public class CharCounter {

  private CharsCount calculateCountChars(String sentence) {
    char[] charsSentence = sentence.toCharArray();
    Map<Character, Integer> mapChars = new HashMap<Character, Integer>();
    for (char charSentence : charsSentence) {
      int countChars = 0;
      if (mapChars.containsKey(charSentence)) {
        countChars = mapChars.get(charSentence);
      }
      countChars++;
      mapChars.put(charSentence, countChars);
    }
    CharsCount counterChars = new CharsCount(mapChars, charsSentence);
    CharCounterCaсhe.setCacheCounter(sentence, counterChars);
    return counterChars;
  }

  CharsCount getCharsCount(String sentence) {
    CharsCount counterChars = CharCounterCaсhe.getCacheCounter(sentence);
    if (counterChars == null) {
      counterChars = calculateCountChars(sentence);
    } else {
      counterChars = counterChars;
    }
    return counterChars;
  }

}
