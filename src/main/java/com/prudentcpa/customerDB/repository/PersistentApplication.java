package com.prudentcpa.customerDB.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

@Configuration
@ImportResource("classpath:cache-config.xml")
@EnableGemfireRepositories
/**
 * 
 * @author zhue
 * 
 * This class provides functionality to persist data to persistent storage
 */
public class PersistentApplication {

}
