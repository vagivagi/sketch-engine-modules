package com.vagivagi.sketch.engine.client;

import com.vagivagi.sketch.engine.response.Word;

import java.util.List;

public interface SketchEngineWebClient {
    List<Word> getThes(String lemma);
}
