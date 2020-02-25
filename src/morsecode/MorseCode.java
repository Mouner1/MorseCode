/*
 * Mouner Dabjan 
 * 24/02/2020
 * This program converts a string input into morse code 
 */
package morsecode;

import javax.swing.*;

/**
 *
 * @author User
 */
public class MorseCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // asking for the user's input
        String input = JOptionPane.showInputDialog(" Enter the word you would like the Morse code of");
        // storing everything in an array
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',};

        String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----"};
        // changing the input to lower case
        input = input.toLowerCase();
        // Translating the input into morse code
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (alphabet[j] == input.charAt(i)) {
                    output += morseCode[j] + " ";

                }
            }
        }
        // printing the result to the screen 
        JOptionPane.showMessageDialog(null, "The morse code is  " + output);

    }

}
