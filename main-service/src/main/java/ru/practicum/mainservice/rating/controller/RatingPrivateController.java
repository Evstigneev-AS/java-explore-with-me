package ru.practicum.mainservice.rating.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.practicum.mainservice.rating.dto.RatingDto;
import ru.practicum.mainservice.rating.dto.RatingRequestDto;
import ru.practicum.mainservice.rating.service.RatingService;

import java.util.List;

@RestController
@RequestMapping("/users/{user-id}")
@RequiredArgsConstructor
public class RatingPrivateController {
    private final RatingService ratingService;

    @PostMapping("/events/{event-id}/ratings")
    @ResponseStatus(HttpStatus.CREATED)
    public RatingDto create(@PathVariable("user-id") Long userId,
                            @PathVariable("event-id") Long eventId,
                            @Valid @RequestBody RatingRequestDto ratingRequestDto) {
        return ratingService.create(userId, eventId, ratingRequestDto);
    }

    @DeleteMapping("/ratings/{rating-id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable("user-id") Long userId,
                           @PathVariable("rating-id") Long ratingId) {
        ratingService.deleteById(userId, ratingId);
    }

    @GetMapping("/ratings")
    public List<RatingDto> getAllRatingsByUser(@PathVariable("user-id") Long userId,
                                               @RequestParam(defaultValue = "0") int from,
                                               @RequestParam(defaultValue = "10") int size) {
        return ratingService.getAllRatingsByUser(userId, from, size);
    }
}