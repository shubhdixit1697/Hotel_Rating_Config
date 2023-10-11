package com.app.RatingService.Services;

import java.util.List;

import com.app.RatingService.Entity.Rating;

public interface RatingService {
	
	Rating cretae(Rating rating);
	
	List<Rating> getRatings();
	
	List<Rating> getRatingsByUserId(String userId);
	
	List<Rating> getRatingsByHotelId(String hotelId);

}
