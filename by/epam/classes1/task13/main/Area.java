package by.epam.classes1.task13.main;

import java.util.Arrays;

public class Area {

    private City areaCenter;
    private String areaName;
    private District [] districts = new District[0];

    public Area(String areaName, City areaCenter){
        this.areaCenter = areaCenter;
        this.areaName = areaName;
    }
    public double getSquare(){

        double square = 0 ;

        for (District district1:districts) {
            square +=district1.getSquare();
        }
        return square;
    }

    public void addDistrict(District district){
        this.districts = Arrays.copyOf(this.districts,this.districts.length+1);
        this.districts[districts.length-1]=district;
    }

    public City getAreaCenter() {
        return areaCenter;
    }

    public void setAreaCenter(City areaCenter) {
        this.areaCenter = areaCenter;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    public double getAreaSquare() {
        return getSquare();
    }

    public District getDistrict(int i){
        return districts[i];
    }
}

