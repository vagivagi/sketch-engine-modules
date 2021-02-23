package com.vagivagi.sketch.engine.client;

import com.vagivagi.sketch.engine.response.ThesaurusResponse;
import com.vagivagi.sketch.engine.response.WordSketchResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class SketchEngineWebClientImpl implements SketchEngineWebClient {
    private final RestTemplate restTemplate;

    public SketchEngineWebClientImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public WordSketchResponse getWordSketch(String lemma) {
        String url = "/bonito/run.cgi/wsketch?corpname={corpname}&lemma={lemma}";
        Map<String, String> parameters = new HashMap<>();
        parameters.put("corpname", "preloaded/bnc2");
        parameters.put("lemma", lemma);
        parameters.put("maxitems", "1");
        ResponseEntity<WordSketchResponse> response = restTemplate.getForEntity(url, WordSketchResponse.class, parameters);
        return response.getBody();
    }

    @Override
    public ThesaurusResponse getThesaurus(String lemma) {
        String url = "/bonito/run.cgi/thes?corpname={corpname}&lemma={lemma}";
        Map<String, String> parameters = new HashMap<>();
        parameters.put("corpname", "preloaded/bnc2");
        parameters.put("lemma", lemma);
        ResponseEntity<ThesaurusResponse> response = restTemplate.getForEntity(url, ThesaurusResponse.class, parameters);
        return response.getBody();
    }
}
