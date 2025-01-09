package com.springbootwithkafka.cab_book_driver.config;

import com.springbootwithkafka.cab_book_driver.constant.AppConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic newTopic() {
        return TopicBuilder
                .name(AppConstant.CAB_LOCATION)
                .build();
    }
}
