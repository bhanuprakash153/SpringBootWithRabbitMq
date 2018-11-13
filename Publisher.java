package com.example.ZRabbitMqSpringBootExample.sender;



import com.example.ZRabbitMqSpringBootExample.config.RabbitConfig;
import com.example.ZRabbitMqSpringBootExample.model.Employee;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Publisher {


    @Autowired
    private AmqpTemplate amqpTemplate;


    public void sendDetails(Employee employee){

        amqpTemplate.convertAndSend(RabbitConfig.saveEmployeeDetails,employee);
    }



}
