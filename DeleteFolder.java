package com.newgen.app;

import java.io.File;

public class DeleteFolder {
    public static void main(String[] args) {
        // Specify the folder path
        String folderPath = "path/to/your/folder";

        // Create a File object for the folder
        File folder = new File(folderPath);

        // Check if the folder exists before deleting
        if (folder.exists()) {
            // Delete the folder
            boolean deleted = folder.delete();

            if (deleted) {
                System.out.println("Folder deleted successfully.");
            } else {
                System.out.println("Failed to delete the folder.");
            }
        } else {
            System.out.println("Folder does not exist.");
        }
    }
}

