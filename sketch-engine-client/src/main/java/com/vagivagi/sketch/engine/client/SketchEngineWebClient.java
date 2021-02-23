package com.vagivagi.sketch.engine.client;

import com.vagivagi.sketch.engine.response.ThesaurusResponse;
import com.vagivagi.sketch.engine.response.WordSketchResponse;

public interface SketchEngineWebClient {
    WordSketchResponse getWordSketch(String lemma);

    ThesaurusResponse getThesaurus(String lemma);
}
