package com.revature.beans;

public class BeanieBaby {
	int id;
	String name;
	String animal;
	int year;
	public BeanieBaby() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BeanieBaby(int id, String name, String animal, int year) {
		super();
		this.id = id;
		this.name = name;
		this.animal = animal;
		this.year = year;
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
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((animal == null) ? 0 : animal.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + year;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BeanieBaby other = (BeanieBaby) obj;
		if (animal == null) {
			if (other.animal != null)
				return false;
		} else if (!animal.equals(other.animal))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BeanieBaby [id=" + id + ", name=" + name + ", animal=" + animal + ", year=" + year + "]";
	}
}
