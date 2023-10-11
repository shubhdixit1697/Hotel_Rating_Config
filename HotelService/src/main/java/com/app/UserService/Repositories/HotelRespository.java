package com.app.UserService.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.UserService.Entity.Hotel;

public interface HotelRespository extends JpaRepository<Hotel, String>{

}
