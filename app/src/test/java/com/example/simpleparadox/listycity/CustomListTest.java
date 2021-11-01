package com.example.simpleparadox.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @BeforeEach
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize + 1);
    }

    @Test
    public void hasCityTest() {
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertEquals(list.hasCity(city), true);
    }

    @Test
    public void deleteCityTest() {
        City city = new City("Toronto", "ON");
        list.addCity(city);
        assertEquals(list.hasCity(city), true);
        list.delete(city);
        assertEquals(list.hasCity(city), false);
    }

    @Test
    public void countCitiesTest() {
        City city = new City("Vancouver", "BC");
        list.addCity(city);
        assertEquals(list.countCities(), 1);
    }
}
