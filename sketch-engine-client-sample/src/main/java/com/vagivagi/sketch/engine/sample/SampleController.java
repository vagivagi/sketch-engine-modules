package com.vagivagi.sketch.engine.sample;

import com.vagivagi.sketch.engine.client.SketchEngineWebClient;
import com.vagivagi.sketch.engine.response.ThesaurusResponse;
import com.vagivagi.sketch.engine.response.WordSketchResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleController {
    private final SketchEngineWebClient sketchEngineWebClient;

    public SampleController(SketchEngineWebClient sketchEngineWebClient) {
        this.sketchEngineWebClient = sketchEngineWebClient;
    }

    @GetMapping("thesaurus/{word}")
    public ThesaurusResponse thesaurusResponse(@PathVariable String word) {
        return this.sketchEngineWebClient.getThesaurus(word);
    }

    @GetMapping("wordSketch/{word}")
    public WordSketchResponse wordSketchResponse(@PathVariable String word) {
        return this.sketchEngineWebClient.getWordSketch(word);
    }

}
