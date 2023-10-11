package com.app.UserService.Entities;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Hotel")
@Builder
public class Hotel {
	
	
	private String id;
	private String name;
	private String location;
	private String about;

}