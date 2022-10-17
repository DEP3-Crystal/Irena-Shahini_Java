package com.crystal.java.file;
import com.crystal.java.DataSource;
import com.crystal.java.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileDataSource implements DataSource {

    @Override
    public List<Person> getData() {
        ArrayList persons = new ArrayList<>(Arrays.asList());
        String line = "";
        try {
//parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\HP\\Crystal\\Irena-Shahini_Java\\Java_OOP\\RandomOOP\\src\\main\\resources\\data.csv"));
            while ((line = br.readLine()) != null)
            {
                persons.add((new Person(Integer.parseInt(line.split(",")[0]), line.split(",")[1])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return persons;
    }
}
