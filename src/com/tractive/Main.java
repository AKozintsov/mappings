package com.tractive;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> products = Arrays.asList("CVCD", "SDFD", "DDDF", "SDFD");
        Map<String, Mapping> mappings = Map.of(
                "CVCD", new Mapping("1", "X"),
                "SDFD", new Mapping("2", "Z"),
                "DDDF", new Mapping("1", ""));
        System.out.println(getMappings(products, mappings));
    }

    public static List<Mapping> getMappings(List<String> products, Map<String, Mapping> mappings) {
        Map<String, Integer> productsCount = new LinkedHashMap<>();
        for (String product : products) {
            if (productsCount.containsKey(product)) {
                productsCount.put(product, productsCount.get(product) + 1);
            } else {
                productsCount.put(product, 1);
            }
        }

        return productsCount.entrySet().stream()
                .map(e -> {
                    var mapping = mappings.get(e.getKey());
                    mapping.setQuantity(e.getValue());
                    return mapping;
                }).collect(Collectors.toList());
    }
}
