package com.vagivagi.sketch.engine.autoconfigure;

import com.vagivagi.sketch.engine.client.SketchEngineWebClient;
import com.vagivagi.sketch.engine.client.SketchEngineWebClientImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
@EnableConfigurationProperties(SketchEngineProperties.class)
public class SketchEngineClientServletAutoConfiguration {
    private final SketchEngineProperties sketchEngineProperties;

    public SketchEngineClientServletAutoConfiguration(SketchEngineProperties sketchEngineProperties) {
        this.sketchEngineProperties = sketchEngineProperties;
    }

    @Bean
    public SketchEngineWebClient sketchEngineWebClient() {
        return new SketchEngineWebClientImpl(sketchEngineProperties.getUsername(), sketchEngineProperties.getApiKey());
    }


}
