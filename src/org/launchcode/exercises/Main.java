package org.launchcode.exercises;

import org.launchcode.Temperature.TemperatureException;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {



        // Test out your Divide() function!

        Divide(3,9);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        CheckFileExtension(studentFiles.get("Brad"));
    }

    public static int Divide(int x, int y)
    {
        // Write code here!

        if ( y == 0 ) {
            try {
                throw new MainException("What is the intention of grades!");
            } catch (MainException e) {
                e.printStackTrace();
            }
        }

        return x/y;

    }

    public static int CheckFileExtension(String fileName)
    {
        int points = 0;

        // Write code here!
        if(fileName.contains(".java")){
            points += 1;
        }

        if (fileName == null ) {
            try {
                points -= 1;
                throw new MainException("minus point for null file! Try again");
            } catch (MainException e) {
                e.printStackTrace();
            }
        }

        return  points;
    }

}
