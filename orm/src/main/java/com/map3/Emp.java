package com.map3;

import javax.persistence.*;
import java.util.*;




@Entity
public class Emp {
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	private int eid;
	private String name;
	
	@ManyToMany
	@JoinTable( name="emp_learn", 
	joinColumns =        { @JoinColumn(name = "eid") },
	inverseJoinColumns = { @JoinColumn(name=  "pid") } 
	)
		private List<Project> projects;
	
	private String projectname;
	
	
	
	
	public Emp(int eid, String name, String projectname, List<Project> project) {
		super();
		this.eid = eid;
		this.name = name;
		this.projectname = projectname;
		this.projects = project;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}




	
	
	
	
	public int getEid() {
		return eid;
	}
	
	

	



	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public List<Project> getProject() {
		return projects;
	}

	public void setProject(List<Project> project) {
		this.projects = project;
	}

	
}
















