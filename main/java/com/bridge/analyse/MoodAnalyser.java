package com.bridge.analyse;

import com.bridge.analyse.exception.ExceptionType;
import com.bridge.analyse.exception.MoodAnalyserException;

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


    public String analyseMood() throws MoodAnalyserException {
        final String sadMood = "SAD";
        try {

            if (message.toUpperCase().contains(sadMood)) {
                return sadMood;
            }
            return "Happy";
        }
        catch (NullPointerException e) {
           throw new MoodAnalyserException("MoodAnalyserException", ExceptionType.Null);

        }

    }
}
