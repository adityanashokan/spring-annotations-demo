package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MovieConfig {

    @Bean
    public Movie getMovie(){
        return new Movie();
    }

    @Bean
    public Actor getActor(){
        Actor actor = new Actor("Bill Hader","male",41);
        return actor;
    }
}
