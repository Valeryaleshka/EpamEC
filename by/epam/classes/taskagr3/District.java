package by.epam.classes.taskagr3;

import java.util.Arrays;

public class District {

    private String district;
    private City [] cities = new City[0];
    private double square;


    public District (String districtName, double square){
        this.district = districtName;
        this.square = square;
    }

    public void addCity(City city){
        this.cities = Arrays.copyOf(this.cities,this.cities.length+1);
        cities[cities.length-1]=city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "District{" +
                "district='" + district + '\'' +
                ", cities=" + Arrays.toString(cities) +
                ", square=" + square +
                '}';
    }
}
