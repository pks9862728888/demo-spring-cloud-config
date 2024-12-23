package com.demo.productservice;

import com.demo.productservice.configs.FeatureToggleConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@Slf4j
@SpringBootApplication
@EnableRetry
@RequiredArgsConstructor
public class ProductServiceApplication implements CommandLineRunner {
    private final FeatureToggleConfig featureToggleConfig;

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Feature 1 toggle is {}", featureToggleConfig.isFeature1());
        log.info("Feature 2 toggle is {}", featureToggleConfig.isFeature2());
    }
}
