package com.demo.userservice;

import com.demo.userservice.config.BlacklistConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@Slf4j
@SpringBootApplication
@RequiredArgsConstructor
@EnableRetry
public class UserServiceApplication implements CommandLineRunner {
    private final BlacklistConfig blacklistConfig;

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @Override
    public void run(String... args) {
        log.info("Blacklisted countries: {}", blacklistConfig.getCountries());
    }
}
