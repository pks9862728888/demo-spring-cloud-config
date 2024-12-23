package com.demo.productservice.configs;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "feature-toggle")
public class FeatureToggleConfig {
    private boolean feature1;
    private boolean feature2;
}
