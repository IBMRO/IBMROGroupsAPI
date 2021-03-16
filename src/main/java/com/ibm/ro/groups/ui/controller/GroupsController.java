package com.ibm.ro.groups.ui.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.ro.groups.ui.dto.GroupDTO;

@RestController
@RequestMapping(path = "/groups")
public class GroupsController {

	@GetMapping(path = "/{groupId}")
	public ResponseEntity<GroupDTO> getGroups(@PathVariable Integer groupId) {

		return new ResponseEntity<GroupDTO>(new GroupDTO(groupId, "Dummy"), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<GroupDTO> createGroup(@PathVariable Integer groupId) {

		return new ResponseEntity<GroupDTO>(new GroupDTO(groupId, "Dummy"), HttpStatus.OK);
	}

	@GetMapping(path = "/version")
	public ResponseEntity<String> getVersion() {
		return new ResponseEntity<String>("V1", HttpStatus.OK);
	}

}
