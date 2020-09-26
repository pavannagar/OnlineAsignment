package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="abcdef")
public class Teacher {

	@Id
	private String name;
	private String no;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public Teacher(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}
	public Teacher() {
		super();
	}
	
	
	
	
}
