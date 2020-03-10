package com.example.jdbc.model.pengaduan;
import java.util.List;
import java.sql.Date;

public class Pengaduan {
	//private List<Pengaduan>pengaduan;
		public String city_id,year;



		@Override
		public String toString() {
			return "PengaduanResult [city_id=" + city_id + ", year=" + year +"]";
		}


		public String getCity_id() {
			return city_id;
		}
		public void setCity_id(String city_id) {
			this.city_id = city_id;
		}
		public String getYear() { return year; }
		public void setYear(String year) {
			this.year = year;
		}

	}







//	public List<Pengaduan> getPengaduan() {
//		return pengaduan;
//	}
//
//	public void setPengaduan(List<Pengaduan> pengaduan) {
//		this.pengaduan = pengaduan;
//	}
//

