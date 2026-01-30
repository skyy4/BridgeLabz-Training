package com.example.fileprocessor;

import java.io.*;

public class FileProcessor {

    public void writeToFile(String f, String c) throws IOException {
        FileWriter w = new FileWriter(f);
        w.write(c);
        w.close();
    }

    public String readFromFile(String f) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(f));
        return br.readLine();
    }
}
