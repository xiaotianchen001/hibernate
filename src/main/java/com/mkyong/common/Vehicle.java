package com.mkyong.common;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {
	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;

@ManyToOne
private UserDetails ud;


public UserDetails getUd() {
	return ud;
}
public void setUd(UserDetails ud) {
	this.ud = ud;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
