package com.mkyong.common;

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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity(name = "laoposi")
public class UserDetails {

	@Id
	@GeneratedValue( strategy=GenerationType.TABLE)
	@Column(name = "User_Id")
	private int Id;
	private String userName;
//	@Embedded
//	@AttributeOverrides({
//	@AttributeOverride(name="city",column=@Column(name="CITY_NAME")),
//	@AttributeOverride(name="street",column=@Column(name="STREET_NAME")),
//
//	})
//	private Address address;

	
	@OneToMany
	private Collection<Vehicle> ve=new ArrayList<Vehicle>();

	public Collection<Vehicle> getVe() {
		return ve;
	}

	public void setVe(Collection<Vehicle> ve) {
		this.ve = ve;
	}

//	@ElementCollection
//	 @GenericGenerator(name = "sequence", strategy = "sequence")
//	 @GeneratedValue(generator = "sequence", strategy=GenerationType.TABLE)
//	    
//	 @CollectionId(columns = { @Column(name="ADDRESS_ID") }, generator = "sequence", type = @Type(type = "long") )
//	 @JoinTable(name="USER_ADDRESS", joinColumns=@JoinColumn(name="USER_ID"))
//	private List<Address> list=new ArrayList<Address>();
//	
//
//	public List<Address> getList() {
//		return list;
//	}
//
//	public void setList(List<Address> list) {
//		this.list = list;
//	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getUserId() {
		return Id;
	}
//
//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}