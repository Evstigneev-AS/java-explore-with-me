package ru.practicum.mainservice.exception.exception;

public class StateConflictException extends RuntimeException {
    public StateConflictException(String message) {
        super(message);
    }
}