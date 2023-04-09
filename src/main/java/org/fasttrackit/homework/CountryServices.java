package org.fasttrackit.homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class CountryServices {
    private List<Countries> countriesList = new ArrayList<>();

    public CountryServices(List<Countries> countries) {
        if (countries != null) {
            this.countriesList.addAll(countries);
        }
    }

    public List<String> listCountryName(){
        return countriesList.stream()
                .map(Countries::getName)
                .toList();
    }

    public List<String> getCapitalOfCountry(String capital){
        return countriesList.stream()
                .filter(countries -> capital.contains(countries.getName()))
                .map(Countries::getCapital)
                .toList();
    }

    public Optional<Integer> getPopulationOfCountry(String population){
        return countriesList.stream()
                .filter(countries -> countries.getName().equals(population))
                .map(Countries::getPopulation)
                .findFirst();
    }

    public List<Countries> getCountryInContinent(String continent){
        return countriesList.stream()
                .filter(countries -> continent.contains(countries.getContinent()))
                .sorted(Comparator.comparing(Countries::getContinent))
                .toList();
    }

    public List<Countries> getCountryInContinentLargeThan(String continent, Integer population) {
        return countriesList.stream()
                .filter(countries -> continent.contains(countries.getContinent()))
                .filter(countries -> countries.getPopulation() > population)
                .toList();

    }
}