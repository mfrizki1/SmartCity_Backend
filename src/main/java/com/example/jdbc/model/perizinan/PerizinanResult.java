package com.example.jdbc.model.perizinan;

import java.sql.Date;
import java.util.List;

public class PerizinanResult {

    private List<Perizinan> perizinanL;

    public static class Perizinan{
        private String name,sum;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSum() {
            return sum;
        }

        public void setSum(String sum) {
            this.sum = sum;
        }


        @Override
        public String toString() {
            return "Perizinan{" +
                    "name='" + name + '\'' +
                    ", sum='" + sum + '\'' +
                    '}';
        }

    }
   // private String city_id,year,progress_type;




//    public String getCity_id() {
//        return city_id;
//    }
//
//    public void setCity_id(String city_id) {
//        this.city_id = city_id;
//    }
//
//    public String getYear() {
//        return year;
//    }
//
//    public void setYear(String year) {
//        this.year = year;
//    }
//
//    public String getProgress_type() {
//        return progress_type;
//    }
//
//    public void setProgress_type(String progress_type) {
//        this.progress_type = progress_type;
//    }
//
//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }
//
//    public Date getCreated_date() {
//        return created_date;
//    }
//
//    public void setCreated_date(Date created_date) {
//        this.created_date = created_date;
//    }
//
//    public Date getModified_date() {
//        return modified_date;
//    }
//
//    public void setModified_date(Date modified_date) {
//        this.modified_date = modified_date;
//    }
//
//    private Date date,created_date,modified_date;


    public List<Perizinan> getPerizinanL() {
        return perizinanL;
    }

    public void setPerizinanL(List<Perizinan> perizinanL) {
        this.perizinanL = perizinanL;
    }
}
