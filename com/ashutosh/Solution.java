package com.ashutosh;

import java.util.ArrayList;
import java.util.List;


public class Solution {

    /**
     * Our product “Tweeter” allows users to post short messages limited to 50 characters
     * each. However, sometimes, users get excited and write messages longer than 50 characters.
     *
     * Instead of rejecting these messages, we would like to add a new feature that will split the message into parts and send multiple messages on the user's behalf, all of them meeting the 50 character requirement.
     *
     * Initiative
     * Suppose the user wants to send the following message:
     * "I can't believe Tweeter now supports chunking my messages, so I don't have to do it myself."
     *
     * This is 91 characters excluding the surrounding quotes.
     * When the user presses send button, it will send the following 2 messages:
     * "1/2 I can't believe Tweeter now supports chunking"
     * "2/2 my messages, so I don't have to do it myself."
     *
     * Now, each message is 49 characters, each within the allowed limit.
     *
     * The splitting logic should not break a word. If the 50th character is in the middle of a word, we will have to split before it.   For example
     *
     * 70 characters
     *
     *     - While building the component make sure that it easy to add more types.
     * 	50 characters
     * 	    - While building the component make sure that it eas
     *
     * 	Output
     * 	    - 1/2 While building the component make sure that it
     * 	    - 2/2 easy to add more types
     *
     *  hr@wednesday.is
     * mac@wednesday.is
     * 	    */


    public static void main(String[] args) {
        String mess1 = "Instead of rejecting these messages, we would like to add a new feature that will split the message into parts and send multiple messages on the user's behalf, all of them meeting the 50 character requirement";
        String message = "I can't believe Tweeter now supports chunking my messages, so I don't have to do it myself";
        System.out.println();
        String[] result = splitMessage(mess1);
        for (String re: result
        ) {
            System.out.println("result : "+ re);
        }



    }


    /** splitMessage() takes one parameter as a String message */
    public static String[] splitMessage(String message){

        // splitedMessage is ArrayList where we are going to add the 50 length message
        List<String> splitedMessage = new ArrayList<>();


        // String[] words from the message using space " "
        String[] words = message.split(" ");
        StringBuilder temp = new StringBuilder();
        // StringBuilder temp hold the string of length 50
        for (int i = 0; i < words.length; i++) {
            String chunk = words[i];
            /*System.out.println(i+" chunks : "+chunk);*/

            // if the length of temp + chunk is greater than 50 it appends the temp into splitedMessage
            if (temp.length() + chunk.length() > 50) {
                splitedMessage.add(temp.toString());
                temp = new StringBuilder();
            }

            // add space after every words
            if (temp.length() != 0) {
                temp.append(" ");
            }
            temp.append(chunk);
        }
        //Add last index chunk
        if (temp.length() != 0) {
            splitedMessage.add(temp.toString());
        }

        String[] results = new String[splitedMessage.size()];
        for (int i = 0; i < splitedMessage.size(); i++) {
            results[i] = String.format("%d/%d %s", i + 1, splitedMessage.size(), splitedMessage.get(i));

        }
        return results;
    }

}
