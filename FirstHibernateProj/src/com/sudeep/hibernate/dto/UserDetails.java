package com.sudeep.hibernate.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	private String userName;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<First
	// reform>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	// private int userId;
	//
	// private String userName;
	//
	// @Temporal(TemporalType.DATE)
	// // This is used to tell hibernate that we want only to save date not the
	// // time stamp in database
	// private Date joinedDate;
	//
	// private String address;
	//
	// @Lob
	// // by default varchar(255) is taken for string in database.if we want to
	// // store bigger data than 255,than we are using "@Lob"
	// // There are 2 types of lob.blob(byte stream) & clob(character stream).
	// private String details;
	//
	// // This field is common for all users
	// // so that if we don't want to store this field into our database.
	// @Transient
	// public static String companyName;
	//
	// @Id
	// @Column(name = "USER_ID")
	// public int getUserId() {
	// return userId;
	// }
	//
	// public void setUserId(int userId) {
	// this.userId = userId;
	// }
	//
	// @Column(name = "USER_NAME")
	// public String getUserName() {
	// // return userName + " From getter";
	// return userName;
	// }
	//
	// public void setUserName(String userName) {
	// this.userName = userName;
	// }
	//
	// public Date getJoinedDate() {
	// return joinedDate;
	// }
	//
	// public void setJoinedDate(Date joinedDate) {
	// this.joinedDate = joinedDate;
	// }
	//
	// public String getAddress() {
	// return address;
	// }
	//
	// public void setAddress(String address) {
	// this.address = address;
	// }
	//
	// public String getDetails() {
	// return details;
	// }
	//
	// public void setDetails(String details) {
	// this.details = details;
	// } }

}
