package com.stradtkt.config;

import com.stradtkt.GuessCount;
import com.stradtkt.MaxNumber;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {
    private int maxNumber = 100;
    private int guessCount = 8;
    @Bean
    @MaxNumber
    public int maxNumber() {
        return maxNumber;
    }
    @Bean
    @GuessCount
    public int guessCount() {
        return guessCount;
    }
}
