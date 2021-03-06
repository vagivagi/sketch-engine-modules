package com.vagivagi.sketch.engine.client;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class SketchEngineWebClientImplTest {
    private SketchEngineWebClient sketchEngineWebClient;

    @BeforeEach
    public void setup() {
        this.sketchEngineWebClient = new SketchEngineWebClientImpl("username", "key");
    }

    @Test
    @Disabled
    public void get_word_sketch(){

    }
}
