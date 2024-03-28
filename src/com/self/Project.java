package com.self;

public class Project {
	int id;
	String name;
	String location;
	public Project(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	public String getlocation()
	{
		return location;
	}
	
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", location=" + location + "]";
	}

}
