package com.example.jdbc.model.pengaduan;

import java.sql.Date;
import java.util.List;

public class PengaduanResult {

	private List<Pengaduan> pengaduan;

	public static class Pengaduan{
		public String id_pengaduan,city_id,jenis_pengaduan_id,month_id,year,progress_type,kode,value,name;
		public Boolean deleted;
		public Date created_date,modified_date;
		public int sum;


//		@Override
//		public String toString() {
//			return "PengaduanResult [id_pengaduan=" + id_pengaduan + ", city_id=" + city_id + ", jenis_pengaduan_id="
//					+ jenis_pengaduan_id + ", month_id=" + month_id + ", year=" + year + ", progress_type=" + progress_type
//					+ ", kode=" + kode + ", value=" + value + ", deleted=" + deleted + ", created_date=" + created_date
//					+ ", modified_date=" + modified_date + "]";
//		}


		@Override
		public String toString() {
			return "Pengaduan{" +
					"id_pengaduan='" + id_pengaduan + '\'' +
					", city_id='" + city_id + '\'' +
					", jenis_pengaduan_id='" + jenis_pengaduan_id + '\'' +
					", month_id='" + month_id + '\'' +
					", year='" + year + '\'' +
					", progress_type='" + progress_type + '\'' +
					", kode='" + kode + '\'' +
					", value='" + value + '\'' +
					", name='" + name + '\'' +
					", deleted=" + deleted +
					", created_date=" + created_date +
					", modified_date=" + modified_date +
					", sum=" + sum +
					'}';
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getSum() {
			return sum;
		}

		public void setSum(int sum) {
			this.sum = sum;
		}

		public String getId_pengaduan() {
			return id_pengaduan;
		}
		public void setId_pengaduan(String id_pengaduan) {
			this.id_pengaduan = id_pengaduan;
		}
		public String getCity_id() {
			return city_id;
		}
		public void setCity_id(String city_id) {
			this.city_id = city_id;
		}
		public String getJenis_pengaduan_id() {
			return jenis_pengaduan_id;
		}
		public void setJenis_pengaduan_id(String jenis_pengaduan_id) {
			this.jenis_pengaduan_id = jenis_pengaduan_id;
		}
		public String getMonth_id() {
			return month_id;
		}
		public void setMonth_id(String month_id) {
			this.month_id = month_id;
		}
		public String getYear() {
			return year;
		}
		public void setYear(String year) {
			this.year = year;
		}
		public String getProgress_type() {
			return progress_type;
		}
		public void setProgress_type(String progress_type) {
			this.progress_type = progress_type;
		}
		public String getKode() {
			return kode;
		}
		public void setKode(String kode) {
			this.kode = kode;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		public Boolean getDeleted() {
			return deleted;
		}
		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}
		public Date getCreated_date() {
			return created_date;
		}
		public void setCreated_date(Date created_date) {
			this.created_date = created_date;
		}
		public Date getModified_date() {
			return modified_date;
		}
		public void setModified_date(Date modified_date) {
			this.modified_date = modified_date;
		}

	}
	
	



	public List<Pengaduan> getPengaduan() {
		return pengaduan;
	}

	public void setPengaduan(List<Pengaduan> pengaduan)
	{
		this.pengaduan = pengaduan;
	}
}
