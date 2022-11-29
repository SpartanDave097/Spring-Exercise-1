package com.cy4gate.personal.demo.exceptions;

public class GameNotFoundException extends RuntimeException {

    public GameNotFoundException(Long id) {super("ID: " + id + " not found ");}
}
