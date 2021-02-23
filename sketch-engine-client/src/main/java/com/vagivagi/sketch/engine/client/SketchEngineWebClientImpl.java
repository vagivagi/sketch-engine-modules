package com.vagivagi.sketch.engine.client;

import com.vagivagi.sketch.engine.response.ThesaurusResponse;
import com.vagivagi.sketch.engine.response.Word;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SketchEngineWebClientImpl implements SketchEngineWebClient {
    private final RestTemplate restTemplate;

    public SketchEngineWebClientImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Word> getThesaurus(String lemma) {
        String url = "/bonito/run.cgi/thes?corpname={corpname}&lemma={lemma}";
        Map<String, String> parameters = new HashMap<>();
        parameters.put("corpname", "preloaded/bnc2");
        parameters.put("lemma", lemma);
        ResponseEntity<ThesaurusResponse> response = restTemplate.getForEntity(url, ThesaurusResponse.class, parameters);
        return response.getBody().getWords();
    }
}
