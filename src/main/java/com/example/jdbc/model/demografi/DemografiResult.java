package com.example.jdbc.model.demografi;

import java.util.List;

public class DemografiResult {

    private List<Demografi> demografis;

    public static class Demografi{

        private String name,year,demographics_type,city_id;
        private Integer value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getDemographics_type() {
            return demographics_type;
        }

        public void setDemographics_type(String demographics_type) {
            this.demographics_type = demographics_type;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public String getCity_id() {
            return city_id;
        }

        public void setCity_id(String city_id) {
            this.city_id = city_id;
        }

        @Override
        public String toString() {
            return "Demografi{" +
                    "name='" + name + '\'' +
                    ", year='" + year + '\'' +
                    ", demographics_type='" + demographics_type + '\'' +
                    ", city_id='" + city_id + '\'' +
                    ", value=" + value +
                    '}';
        }
    }

    public List<Demografi> getDemografis() {
        return demografis;
    }

    public void setDemografis(List<Demografi> demografis) {
        this.demografis = demografis;
    }
}
