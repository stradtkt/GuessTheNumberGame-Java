package com.stradtkt.config;

import com.stradtkt.GuessCount;
import com.stradtkt.MaxNumber;
import com.stradtkt.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/game.properties")
public class GameConfig {
    @Value("${game.maxNumber}")
    private int maxNumber;
    @Value("${game.guessCount}")
    private int guessCount;
    @Value("${game.minNumber}")
    private int minNumber;
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
    @Bean
    @MinNumber
    public int minNumber() {
        return minNumber;
    }
}
