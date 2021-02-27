package com.vagivagi.sketch.engine.autoconfigure;

import com.vagivagi.sketch.engine.client.SketchEngineWebClient;
import com.vagivagi.sketch.engine.client.SketchEngineWebClientImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
public class SketchEngineClientServletAutoConfigure {
    @Bean
    public SketchEngineWebClient sketchEngineWebClient() {
        return new SketchEngineWebClientImpl("", "");
    }
}
