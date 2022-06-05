package com.bridge.analyse;

public class MoodAnalyser {
    String message;

    public MoodAnalyser(String mood) {
        this.message = mood;
    }

    public MoodAnalyser() {

    }

    public void setMessage(String message) {
        this.message = message;
    }


    public String analyseMood() {
        final String sadMood = "SAD";
        if (message.toUpperCase().contains(sadMood)) {
            return sadMood;
        }
        return "Happy";

    }
}
