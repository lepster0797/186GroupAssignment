package com.groupAssignment;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Save{
    //takes a String filename , and an Arraylist as parameters
    public static void saveToFile(String fileName, ArrayList list) throws IOException {
        Path filePath = Paths.get(fileName); //to get the directory which is the project folder

            System.out.println("File Saved");
            Files.write(filePath, list, Charset.defaultCharset()); //writes the file
    }
}