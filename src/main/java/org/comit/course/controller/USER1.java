package org.comit.course.controller;

import java.util.Date;

public class USER1 {

	     int idUser;
		 String firstName;
		 String lastName ; 
		 String name ;     
		 Date birth ;      
		 String status ;
		public int getIdUser() {
			return idUser;
		}
		public void setIdUser(int idUser) {
			this.idUser = idUser;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Date getBirth() {
			return birth;
		}
		public void setBirth(Date birth) {
			this.birth = birth;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		@Override
		public String toString() {
			return "USER1 [idUser=" + idUser + ", firstName=" + firstName + ", lastName=" + lastName + ", name=" + name
					+ ", birth=" + birth + ", status=" + status + "]";
		}
		 
	
}
