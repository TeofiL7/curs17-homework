package org.fasttrackit.homework;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Countries> countries = FileReader.provideCountries("countries.txt");

        CountryServices countryServices = new CountryServices(countries);
        System.out.println("All countries: " + countries);
        System.out.println("\nList all countries name: \n" + countryServices.listCountryName());
        System.out.println("\nCapital of A country: \n" + countryServices.getCapitalOfCountry("Romania"));
        System.out.println("\nPopulation of A country: \n" + countryServices.getPopulationOfCountry("San Marino"));
        System.out.println("\nCountries in A continent: \n" + countryServices.getCountryInContinent("Africa"));
        System.out.println("\nCountry in A continent with population larger than: \n" + countryServices.getCountryInContinentLargeThan("Asia",150000000));
    }
}
