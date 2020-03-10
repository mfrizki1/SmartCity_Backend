package com.example.jdbc.model.demografi;

public class Demografi {


    private String city_id,year;

    @Override
    public String toString() {
        return "Perizinan{" +
                "city_id='" + city_id + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
