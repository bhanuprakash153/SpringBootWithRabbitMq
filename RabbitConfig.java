package com.example.ZRabbitMqSpringBootExample.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    public static final String saveEmployeeDetails = "saveEmployeeDetails";
    public static final String employeeExchange = "employeeExchange";


    @Bean
    Queue queue() {

        return QueueBuilder.durable(saveEmployeeDetails).build();
    }

    @Bean
    Exchange exchange() {

        return ExchangeBuilder.topicExchange(employeeExchange).build();
    }

    @Bean
    Binding binding(Queue queue, TopicExchange exchange) {

        return BindingBuilder.bind(queue).to(exchange).with(saveEmployeeDetails);
    }

}
