package com.example.springbootsample.webapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:parent.properties")
@PropertySource(value = "classpath:parent-${spring.profiles.active:default}.properties", ignoreResourceNotFound = true)
public class ParentConfig {

}