package com.test.utils;

import java.io.*;
import java.util.Scanner;

public class CsvFileReader {

    public static void readColoumnValues() {

        String line = "";
        String splitBy = ",";
        try {
            BufferedReader br = new BufferedReader(new FileReader("Sample.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] employee = line.split(splitBy);    // use comma as separator
                System.out.println("Employee [First Name=" + employee[0] + ", Last Name=" + employee[1] + ", Designation=" + employee[2] + ", Contact=" + employee[3] + ", Salary= " + employee[4] + ", City= " + employee[5] + "]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readCsvFile() throws FileNotFoundException {
        {
//parsing a CSV file into Scanner class constructor
            Scanner sc = new Scanner(new File("Sample.csv"));
            sc.useDelimiter(",");   //sets the delimiter pattern
            while (sc.hasNext())  //returns a boolean value
            {
                System.out.print(sc.next());  //find and returns the next complete token from this scanner
            }
            sc.close();  //closes the scanner
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        readColoumnValues();
        readCsvFile();
    }
}