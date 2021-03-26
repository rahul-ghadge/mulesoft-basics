package com.arya.demo.service;

import java.io.Serializable;

class Superhero implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;

	private String name;
	private String superName;
	private String profession;
	private int age;
	private boolean canFly;

	public Superhero() {
	}

	public Superhero(int id, String name, String superName, String profession, int age, boolean canFly) {
		this.id = id;
		this.name = name;
		this.superName = superName;
		this.profession = profession;
		this.age = age;
		this.canFly = canFly;
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

	public String getSuperName() {
		return superName;
	}

	public void setSuperName(String superName) {
		this.superName = superName;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Superhero [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", superName=");
		builder.append(superName);
		builder.append(", profession=");
		builder.append(profession);
		builder.append(", age=");
		builder.append(age);
		builder.append(", canFly=");
		builder.append(canFly);
		builder.append("]");
		return builder.toString();
	}

}
