package com.example.ZRabbitMqSpringBootExample.Receiver;


import com.example.ZRabbitMqSpringBootExample.config.RabbitConfig;
import com.example.ZRabbitMqSpringBootExample.model.Employee;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @RabbitListener(queues = RabbitConfig.saveEmployeeDetails)
    public void Receiver(Employee employee) {

       // System.out.println("receiving:" + employee);

        System.out.println("name of employee:" + employee.getEmpName() + "\n" + "employee of ID:" + employee.getEmpId() +
                "\n" + "Salary of Employee:" +  employee.getAmount());

    }
}
