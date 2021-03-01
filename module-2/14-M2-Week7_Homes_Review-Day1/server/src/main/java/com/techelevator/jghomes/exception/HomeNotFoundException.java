package com.techelevator.jghomes.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus( code = HttpStatus.NOT_FOUND, reason = "Hotel not found.")
public class HomeNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public HomeNotFoundException() {
        super("Hotel not found.");
    }
}

