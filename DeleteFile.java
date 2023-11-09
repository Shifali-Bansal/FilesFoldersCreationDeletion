package com.newgen.app;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "path/to/your/file.txt";

        // Create a File object
        File file = new File(filePath);

        // Check if the file exists before deleting
        if (file.exists()) {
            // Delete the file
            boolean deleted = file.delete();

            if (deleted) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
