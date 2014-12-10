package com.sudeep.hibernate.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userName;
	@ManyToMany
	// @OneToMany(mappedBy = "user")
	// @JoinTable(name = "USER_VEHICAL", joinColumns = @JoinColumn(name =
	// "USER_ID"), inverseJoinColumns = @JoinColumn(name = "VEHICAL_ID"))
	private Collection<Vehical> vehicals = new ArrayList<Vehical>();

	// @OneToOne
	// private Vehical vehical;

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

	public Collection<Vehical> getVehicals() {
		return vehicals;
	}

	public void setVehicals(Collection<Vehical> vehicals) {
		this.vehicals = vehicals;
	}

	// <<<<<<<<<<<<<<<<<<<<<<<<<<<Third
	// Change>>>>>>>>>>>>>>>>>>>>>>>>>>
	// @Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	// private int userId;
	// private String userName;
	// @ElementCollection(fetch = FetchType.EAGER)
	// @JoinTable(name = "USER_ADDRESS", joinColumns = @JoinColumn(name =
	// "USER_ID"))
	// @GenericGenerator(name = "hilo-gen", strategy = "hilo")
	// @CollectionId(columns = { @Column(name = "ADDRESS_ID") }, generator =
	// "hilo-gen", type = @Type(type = "long"))
	// private Collection<Address> addresses = new ArrayList<Address>();
	//
	// public int getUserId() {
	// return userId;
	// }
	//
	// public void setUserId(int userId) {
	// this.userId = userId;
	// }
	//
	// public String getUserName() {
	// return userName;
	// }
	//
	// public void setUserName(String userName) {
	// this.userName = userName;
	// }
	//
	// public Collection<Address> getAddresses() {
	// return addresses;
	// }
	//
	// public void setAddresses(Collection<Address> addresses) {
	// this.addresses = addresses;
	// }

	// >>>>>>>>>>>>>>>>>>>>>>Second Change<<<<<<<<<<<<<<<<<<<<<<<<
	// // @Id
	// // @GeneratedValue(strategy = GenerationType.AUTO)
	// @EmbeddedId
	// private LoginName userId;
	//
	// private String userName;
	//
	// @Embedded
	// @AttributeOverrides({
	// @AttributeOverride(column = @Column(name = "HOME_STREET_NAME"), name =
	// "street"),
	// @AttributeOverride(column = @Column(name = "HOME_STATE_NAME"), name =
	// "state"),
	// @AttributeOverride(column = @Column(name = "HOME_CITY_NAME"), name =
	// "city"),
	// @AttributeOverride(column = @Column(name = "HOME_PIN_CODE"), name =
	// "pincode") })
	// private Address homeAddress;
	//
	// @Embedded
	// private Address officeAddress;
	//
	//
	// public LoginName getUserId() {
	// return userId;
	// }
	//
	// public void setUserId(LoginName userId) {
	// this.userId = userId;
	// }
	//
	// public String getUserName() {
	// return userName;
	// }
	//
	// public void setUserName(String userName) {
	// this.userName = userName;
	// }
	//
	// public Address getHomeAddress() {
	// return homeAddress;
	// }
	//
	// public void setHomeAddress(Address homeAddress) {
	// this.homeAddress = homeAddress;
	// }
	//
	// public Address getOfficeAddress() {
	// return officeAddress;
	// }
	//
	// public void setOfficeAddress(Address officeAddress) {
	// this.officeAddress = officeAddress;
	// }

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
