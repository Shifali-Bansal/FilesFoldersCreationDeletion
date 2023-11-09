package com.newgen.app;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            // Specify the file path
            String filePath = "path/to/your/file.txt";

            // Create a new file
            File file = new File(filePath);

            // Create the file (if it doesn't exist)
            boolean success = file.createNewFile();

            if (success) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
