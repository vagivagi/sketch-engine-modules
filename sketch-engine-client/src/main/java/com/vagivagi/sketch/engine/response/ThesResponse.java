package com.vagivagi.sketch.engine.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class ThesResponse {
    private String lemma;
    @JsonProperty("lemma_conc_link")
    private String lemmaConcLink;
    private String lops;
    private int freq;
    private int relfreq;
    @JsonProperty("corp_full_name")
    private String corpFullName;
    private int minfreq;
    private String wsattr;
    @JsonProperty("alt_lposes")
    private List<Map<String, String>> altLposes;
    @JsonProperty("wspos_dict")
    private Map<String, String> wsposDict;
    @JsonProperty("api_version")
    private String apiVersion;
    private Map<String, String> request;
    @JsonProperty("Words")
    private List<Word> words;

    public String getLemma() {
        return lemma;
    }

    public void setLemma(String lemma) {
        this.lemma = lemma;
    }

    public String getLemmaConcLink() {
        return lemmaConcLink;
    }

    public void setLemmaConcLink(String lemmaConcLink) {
        this.lemmaConcLink = lemmaConcLink;
    }

    public String getLops() {
        return lops;
    }

    public void setLops(String lops) {
        this.lops = lops;
    }

    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }

    public int getRelfreq() {
        return relfreq;
    }

    public void setRelfreq(int relfreq) {
        this.relfreq = relfreq;
    }

    public String getCorpFullName() {
        return corpFullName;
    }

    public void setCorpFullName(String corpFullName) {
        this.corpFullName = corpFullName;
    }

    public int getMinfreq() {
        return minfreq;
    }

    public void setMinfreq(int minfreq) {
        this.minfreq = minfreq;
    }

    public String getWsattr() {
        return wsattr;
    }

    public void setWsattr(String wsattr) {
        this.wsattr = wsattr;
    }

    public List<Map<String, String>> getAltLposes() {
        return altLposes;
    }

    public void setAltLposes(List<Map<String, String>> altLposes) {
        this.altLposes = altLposes;
    }

    public Map<String, String> getWsposDict() {
        return wsposDict;
    }

    public void setWsposDict(Map<String, String> wsposDict) {
        this.wsposDict = wsposDict;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Map<String, String> getRequest() {
        return request;
    }

    public void setRequest(Map<String, String> request) {
        this.request = request;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }
}
