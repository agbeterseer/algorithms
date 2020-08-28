/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstNonRepeatedChar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Terseer
 */
public class PrintNonRepeaterdCharacter {

 public static char firstNonRepeatingChar(String word) { 
     Set<Character> repeating = new HashSet<>();
     System.out.println("First time" + repeating);
     List<Character> nonRepeating = new ArrayList<>();
      System.out.println("Second time" + repeating);
     for (int i = 0; i < word.length(); i++) { 
         char letter = word.charAt(i);  
         if (repeating.contains(letter)) { 
              System.out.println("getting the repeated character" + repeating);
             continue; 
         } 
         if (nonRepeating.contains(letter)) { 
             nonRepeating.remove((Character) letter); 
             repeating.add(letter); 
             System.out.println("repeating" + repeating);
         } else { 
             nonRepeating.add(letter);
             
         } 
     }
     System.out.println("non repeating" + nonRepeating);
     return nonRepeating.get(0); 
 }
 
 
    public static void main(String[] args) {
        String originalText = "Great responsibility";
     char c = firstNonRepeatingChar(originalText);
        System.out.println("upperlinktest.PrintNonRepeaterdCharacter.main()"+ c);
    }

}
