package ru.practicum.mainservice.rating.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.practicum.mainservice.rating.dto.RatingDto;
import ru.practicum.mainservice.rating.model.RatingSortType;
import ru.practicum.mainservice.rating.service.RatingService;

import java.util.List;

@RestController
@RequestMapping("/ratings")
@RequiredArgsConstructor
public class RatingPublicController {
    private final RatingService ratingService;

    @GetMapping("/events/{event-id}")
    public List<RatingDto> getAllRatingsByEvent(@PathVariable("event-id") Long eventId,
                                                @RequestParam(defaultValue = "NEW_AND_USEFUL") RatingSortType sortType,
                                                @RequestParam(defaultValue = "0") int from,
                                                @RequestParam(defaultValue = "10") int size) {
        return ratingService.getAllRatingsByEvent(eventId, sortType, from, size);
    }

    @GetMapping("/{rating-id}")
    public RatingDto getRatingById(@PathVariable("rating-id") Long ratingId) {
        return ratingService.getRatingById(ratingId);
    }
}