package com.example.advancedhw11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class list {
    private String Address = "C:\\Users\\USER\\AndroidStudioProjects\\MyApplication\\advancedHW11\\9_10.txt";
    private String InvoiceNumber[] = new String[7];
    private int LineNumber=0;

    public list(String address) {
        try {
            Address = address;
            File file = new File(Address);
            FileInputStream readIn = new FileInputStream(file);
            InputStreamReader read = new InputStreamReader(readIn, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(read);
            String oneLine = null;
            while ((oneLine = bufferedReader.readLine()) != null) {
                InvoiceNumber[LineNumber]=oneLine;
                LineNumber++;
                //System.out.println(oneLine);
            }
            read.close();
        } catch (Exception e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
    public String[] getInvoiceNumber(){
        return InvoiceNumber;
    }
}