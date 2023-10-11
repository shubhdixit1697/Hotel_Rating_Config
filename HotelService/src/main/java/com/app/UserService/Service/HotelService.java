package com.app.UserService.Service;

import java.util.List;

import com.app.UserService.Entity.Hotel;

public interface HotelService {
	
	Hotel create(Hotel hotel);
	
	List<Hotel> getAll();
	
	Hotel get(String id);

}
