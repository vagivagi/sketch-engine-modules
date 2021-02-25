package com.vagivagi.sketch.engine;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vagivagi.sketch.engine.client.SketchEngineWebClientImpl;
import com.vagivagi.sketch.engine.response.ThesaurusResponse;
import com.vagivagi.sketch.engine.response.WordSketchResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SketchEngineClientApplication implements CommandLineRunner {
    @Value("${username}")
    private String username;
    @Value("${apiKey}")
    private String apiKey;

    public static void main(String[] args) {
        SpringApplication.run(SketchEngineClientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SketchEngineWebClientImpl sketchEngineWebClient = new SketchEngineWebClientImpl(username, apiKey);
        for (ThesaurusResponse.Word word : sketchEngineWebClient.getThesaurus("study").getWords()) {
            System.out.println(word);
        }
        WordSketchResponse output = sketchEngineWebClient.getWordSketch("study");
        ObjectMapper mapper = new ObjectMapper();
        String outputFormatted = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(output);
        System.out.println(outputFormatted);
    }
}
