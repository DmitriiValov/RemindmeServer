package com.prolev.remindme.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by dmitryvalov on 23.07.17.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.prolev.remindme.server")
public class WebConfig extends WebMvcConfigurerAdapter{

}
