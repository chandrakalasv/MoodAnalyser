package com.bridge.analyse.exception;

public class MoodAnalyserException extends RuntimeException {
    public ExceptionType type;
    public MoodAnalyserException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
