package com.bugfinder.moviedataservice.resource;


import com.bugfinder.moviedataservice.mdel.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") int movieId) {
        return new Rating(movieId,4);
    }

}
