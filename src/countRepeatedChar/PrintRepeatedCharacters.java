/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countRepeatedChar;

/**
 *
 * @author Terseer
 */
public class PrintRepeatedCharacters {

    public char[] repeatedCharacter(String originalText) {
        int count;
        //Converts given string into character array  
        char newText[] = originalText.toCharArray();
        System.out.println("Duplicate characters in a given string: ");

        //Counts each character present in the string  
        for (int i = 0; i < newText.length; i++) {
            count = 1;
            for (int j = i + 1; j < newText.length; j++) {
                // make sure we dont compare character already checked
                if (newText[i] == newText[j] && newText[i] != ' ') {
                    count++;
                    newText[j] = '0'; 
                }
            }

            //check if count is > 1 and return a character and the number of times it occours
            if (count > 1 && newText[i] != '0') {
                System.out.println(newText[i] + "=" + count);
            }

        }
        return newText;
    }

    public static void main(String[] args) {
        String originalText = "Great responsibility";
        PrintRepeatedCharacters printRepeaterdCharacter = new PrintRepeatedCharacters();
        printRepeaterdCharacter.repeatedCharacter(originalText);
    }

}
