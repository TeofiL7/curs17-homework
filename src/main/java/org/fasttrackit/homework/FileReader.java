package org.fasttrackit.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileReader {
    public static List<Countries> provideCountries(String fileName) throws FileNotFoundException {
        List<Countries> countries = new ArrayList<>();
        Scanner scanner = new Scanner(new File("files", fileName));
        while (scanner.hasNext()) {
            String[] result = scanner.nextLine().split(Pattern.quote("|"));
            countries.add(new Countries(result[0], result[1], Integer.parseInt(result[2]), Integer.parseInt(result[3]),result[4]));
        }
        return countries;
    }
}