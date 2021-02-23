package com.vagivagi.sketch.engine.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class WordSketchResponse {
    @JsonProperty("Gramrels")
    private List<Gramrel> gramrelList;
    @JsonProperty("Grnowords")
    private List<Grnoword> grnowords;
    private String restriction;
    private String seppage;
    private String lops;
    @JsonProperty("alt_lposes")
    private List<Map<String, String>> altLposes;
    private String lemma;
    @JsonProperty("lemma_conc_link")
    private String lemmaConcLink;
    private int freq;
    private double relfreq;
    @JsonProperty("corp_full_name")
    private String corpFullName;
    private int minfreq;
    private double wllimit;
    @JsonProperty("Histograms")
    private List<String> histograms;
    private String filterwords;
    private String filterseek;
    private String gramrels;
    private boolean cominbed;
    @JsonProperty("lpos_dict")
    private Map<String, String> lposDict;
    @JsonProperty("Bimmenu")
    private List<String> bimmenu;
    @JsonProperty("api_version")
    private String apiVersion;
    private Request request;

    public List<Gramrel> getGramrelList() {
        return gramrelList;
    }

    public void setGramrelList(List<Gramrel> gramrelList) {
        this.gramrelList = gramrelList;
    }

    public List<Grnoword> getGrnowords() {
        return grnowords;
    }

    public void setGrnowords(List<Grnoword> grnowords) {
        this.grnowords = grnowords;
    }

    public String getRestriction() {
        return restriction;
    }

    public void setRestriction(String restriction) {
        this.restriction = restriction;
    }

    public String getSeppage() {
        return seppage;
    }

    public void setSeppage(String seppage) {
        this.seppage = seppage;
    }

    public String getLops() {
        return lops;
    }

    public void setLops(String lops) {
        this.lops = lops;
    }

    public List<Map<String, String>> getAltLposes() {
        return altLposes;
    }

    public void setAltLposes(List<Map<String, String>> altLposes) {
        this.altLposes = altLposes;
    }

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

    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }

    public double getRelfreq() {
        return relfreq;
    }

    public void setRelfreq(double relfreq) {
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

    public double getWllimit() {
        return wllimit;
    }

    public void setWllimit(double wllimit) {
        this.wllimit = wllimit;
    }

    public List<String> getHistograms() {
        return histograms;
    }

    public void setHistograms(List<String> histograms) {
        this.histograms = histograms;
    }

    public String getFilterwords() {
        return filterwords;
    }

    public void setFilterwords(String filterwords) {
        this.filterwords = filterwords;
    }

    public String getFilterseek() {
        return filterseek;
    }

    public void setFilterseek(String filterseek) {
        this.filterseek = filterseek;
    }

    public String getGramrels() {
        return gramrels;
    }

    public void setGramrels(String gramrels) {
        this.gramrels = gramrels;
    }

    public boolean isCominbed() {
        return cominbed;
    }

    public void setCominbed(boolean cominbed) {
        this.cominbed = cominbed;
    }

    public Map<String, String> getLposDict() {
        return lposDict;
    }

    public void setLposDict(Map<String, String> lposDict) {
        this.lposDict = lposDict;
    }

    public List<String> getBimmenu() {
        return bimmenu;
    }

    public void setBimmenu(List<String> bimmenu) {
        this.bimmenu = bimmenu;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public static class Gramrel {
        private String name;
        private int count;
        private double score;
        private String conclink;
        private String seek;
        @JsonProperty("Words")
        private List<Word> words;
        private String headword;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        public String getConclink() {
            return conclink;
        }

        public void setConclink(String conclink) {
            this.conclink = conclink;
        }

        public String getSeek() {
            return seek;
        }

        public void setSeek(String seek) {
            this.seek = seek;
        }

        public List<Word> getWords() {
            return words;
        }

        public void setWords(List<Word> words) {
            this.words = words;
        }

        public String getHeadword() {
            return headword;
        }

        public void setHeadword(String headword) {
            this.headword = headword;
        }
    }

    public static class Word {
        private String word;
        private String lempos;
        private int count;
        private double score;
        private String seek;
        private int id;
        private String cm;
        private int cmf;
        @JsonProperty("High")
        private List<String> high;
        private String conclink;
        private String filterseek;
        private String filterwords;

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public String getLempos() {
            return lempos;
        }

        public void setLempos(String lempos) {
            this.lempos = lempos;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        public String getSeek() {
            return seek;
        }

        public void setSeek(String seek) {
            this.seek = seek;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCm() {
            return cm;
        }

        public void setCm(String cm) {
            this.cm = cm;
        }

        public int getCmf() {
            return cmf;
        }

        public void setCmf(int cmf) {
            this.cmf = cmf;
        }

        public List<String> getHigh() {
            return high;
        }

        public void setHigh(List<String> high) {
            this.high = high;
        }

        public String getConclink() {
            return conclink;
        }

        public void setConclink(String conclink) {
            this.conclink = conclink;
        }

        public String getFilterseek() {
            return filterseek;
        }

        public void setFilterseek(String filterseek) {
            this.filterseek = filterseek;
        }

        public String getFilterwords() {
            return filterwords;
        }

        public void setFilterwords(String filterwords) {
            this.filterwords = filterwords;
        }
    }

    public static class Grnoword {
        private String name;
        private int count;
        private double score;
        private String conclink;
        private String seek;
        @JsonProperty("Words")
        private List<Word> words;
        private String headword;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        public String getConclink() {
            return conclink;
        }

        public void setConclink(String conclink) {
            this.conclink = conclink;
        }

        public String getSeek() {
            return seek;
        }

        public void setSeek(String seek) {
            this.seek = seek;
        }

        public List<Word> getWords() {
            return words;
        }

        public void setWords(List<Word> words) {
            this.words = words;
        }

        public String getHeadword() {
            return headword;
        }

        public void setHeadword(String headword) {
            this.headword = headword;
        }
    }
}
