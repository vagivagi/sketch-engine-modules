package com.vagivagi.sketch.engine.response;

public class Word {
    private String word;
    private double score;
    private int freq;
    private int id;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "word=" + this.word + ", score=" + this.score + ", freq=" + this.freq + ", id=" + this.id;
    }
}
