package com.demo.userservice.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "blacklist")
@Getter
@Setter
public class BlacklistConfig {
    private List<String> countries;
}