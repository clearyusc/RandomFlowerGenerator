package com.jetbrains;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by rcleary on 4/12/17.
 *
 * This class will handle retrieving the information from the user
 * regarding special dates, how frequent he wants to get flowers, etc.
 *
 * Input-
 *       Her birthday
 *       Anniversary (dating, wedding, etc.)
 *       Any other important dates (milestones, special moments, etc.)
 *       [Valentine's day will be programmatically captured]
 *
 *
 */

public class UserInput {
    private static void usingBufferedReader()
    {
        System.out.println("Name: ");
        try{
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String inputString = bufferRead.readLine();

            System.out.println("Name entered : " + inputString);
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public UserInput () {
        usingBufferedReader();
    }



}
