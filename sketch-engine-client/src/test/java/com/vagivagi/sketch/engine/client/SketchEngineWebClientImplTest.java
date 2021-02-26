package com.vagivagi.sketch.engine.client;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.BeforeEach;
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
    @Ignore
    public void get_word_sketch(){

    }
}
