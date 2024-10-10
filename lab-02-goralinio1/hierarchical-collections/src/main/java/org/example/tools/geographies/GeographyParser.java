package org.example.tools.geographies;

import org.example.model.Geography;
import org.example.tools.abstractions.IParse;

import java.util.Objects;

public class GeographyParser implements IParse<Geography> {
    public GeographyParser() {

    }

    public Geography parse(String input) {
        input = input.trim();
        String[] tokens = input.split(";");
        Geography geography = new Geography();
        geography.setId(Integer.parseInt(tokens[0]));
        geography.setName(tokens[2]);
        geography.setType(tokens[1]);
        geography.setCode(tokens[3]);
        if (!Objects.equals(tokens[4], "NULL")) {
            geography.setParentId(Integer.parseInt(tokens[4]));
        }

        return geography;

    }
}

