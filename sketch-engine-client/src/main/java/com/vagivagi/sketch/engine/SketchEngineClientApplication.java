package com.vagivagi.sketch.engine;

import com.vagivagi.sketch.engine.client.SketchEngineWebClientImpl;
import com.vagivagi.sketch.engine.response.Word;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

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
        RestTemplateBuilder builder = new RestTemplateBuilder();
        RestTemplate restTemplate = builder.rootUri("https://api.sketchengine.eu")
                .basicAuthentication(username, apiKey).build();
        SketchEngineWebClientImpl sketchEngineWebClient = new SketchEngineWebClientImpl(restTemplate);
        for (Word word : sketchEngineWebClient.getThes("study")) {
            System.out.println(word);
        }
    }
}
