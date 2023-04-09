package org.fasttrackit.homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Countries {
    private String name;
    private String capital;
    private Integer population;
    private Integer area;
    private String continent;

    @Override
    public String toString() {
        return "\nCOUNTRIES(name-%s, capital-%s, population-%s, area-%s, continent-%s)\n".formatted(name, capital,population,area,continent);
    }
}