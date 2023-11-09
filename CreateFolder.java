package com.newgen.app;

import java.io.File;

public class CreateFolder {
    public static void main(String[] args) {
        // Specify the folder path
        String folderPath = "path/to/your/folder";

        // Create a File object for the folder
        File folder = new File(folderPath);

        // Create the folder (if it doesn't exist)
        boolean success = folder.mkdir();

        if (success) {
            System.out.println("Folder created successfully.");
        } else {
            System.out.println("Folder already exists or creation failed.");
        }
    }
}

