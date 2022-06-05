package com.bridge.analyse;

public class MoodAnalyser {

    public String analyseMood(String message) {
        final String sadMood = "SAD";
        if (message.toUpperCase().contains(sadMood)) {
            return sadMood;
        }
            return "Happy";

    }
}
