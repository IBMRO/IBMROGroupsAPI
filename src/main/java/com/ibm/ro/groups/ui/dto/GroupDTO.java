package com.ibm.ro.groups.ui.dto;

public class GroupDTO {

	private Integer id;
	private String name;

	public GroupDTO() {
		super();
	}

	public GroupDTO(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
