package com.app.RatingService.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.RatingService.Entity.Rating;

public interface RatingRepository extends MongoRepository<Rating, String> {
	
	List<Rating> findByUserId(String userId);
	
	List<Rating> findByHotelId(String hotelId);
	
	

}
