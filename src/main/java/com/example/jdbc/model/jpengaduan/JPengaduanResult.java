package com.example.jdbc.model.jpengaduan;

import java.sql.Date;
import java.util.List;

public class JPengaduanResult {

	private List<JPengaduanR> jpengaduanr;
	public List<JPengaduanR> getJpengaduanr()
	{ return jpengaduanr; }
	public void setJpengaduanr(List<JPengaduanR> jpengaduanr)
	{ this.jpengaduanr = jpengaduanr; }

	public static class JPengaduanR{
		private String jenis_pengaduan_id,name,active_flag;
		private Date created_date,modified_date;
		private Boolean deleted;
		private Integer round;

		@Override
		public String toString() {
			return "JPengaduanResult{" +
					"jenis_pengaduan_id='" + jenis_pengaduan_id + '\'' +
					", name='" + name + '\'' +
					", active_flag='" + active_flag + '\'' +
					", created_date=" + created_date +
					", modified_date=" + modified_date +
					", deleted=" + deleted +
					", round=" + round +
					'}';
		}

		public String getJenis_pengaduan_id() {
			return jenis_pengaduan_id;
		}
		public void setJenis_pengaduan_id(String jenis_pengaduan_id) {
			this.jenis_pengaduan_id = jenis_pengaduan_id;
		}
		public String getActive_flag() {
			return active_flag;
		}
		public void setActive_flag(String active_flag) {
			this.active_flag = active_flag;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
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
		public Boolean getDeleted() {
			return deleted;
		}
		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}
		public Integer getRound(){return round;}
		public void setRound(Integer round){this.round=round;}

	}


}
