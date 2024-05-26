package com.example.tpcustomerserviceapi;

import com.example.tpcustomerserviceapi.entities.Customer;
import com.example.tpcustomerserviceapi.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TpCustomerServiceApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerDataServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("Ilham").email("ilham@gmail.com").build());
            customerRepository.save(Customer.builder().name("Imane").email("imane@gmail.com").build());
            customerRepository.save(Customer.builder().name("Mohamed").email("mohamed@gmail.com").build());
        };
    }

}
