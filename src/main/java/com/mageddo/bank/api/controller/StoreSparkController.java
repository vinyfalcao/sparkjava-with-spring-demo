package com.mageddo.bank.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mageddo.bank.api.config.Spark;
import com.mageddo.bank.api.service.StoreService;

@Component
public class StoreSparkController implements Spark {

    private static Logger LOGGER = LoggerFactory.getLogger(StoreSparkController.class);

    @Autowired
    private StoreService customerService;


    @Override
    public void register() {/*
        get("/customer/:customerName", (request, response) -> {
            final String name = request.params(":customerName");
            final List<CustomerEntity> customerEntities = customerService.findByName(name);
            response.type("application/json");
            return new ObjectMapper().writeValueAsString(customerEntities);
        });
        post("/customer/", (request, response) -> {
            final CustomerEntity customerEntity = new ObjectMapper().readValue(request.body(), CustomerEntity.class);
            customerService.createCustomer(customerEntity);
            return "";
        });
        post("/customers/", (request, response) -> {
            try {
                final List<CustomerEntity> customerEntity = new ObjectMapper()
                        .readValue(request.body(), new TypeReference<List<CustomerEntity>>() {
                        });
                manyCustomersService.createCustomers(customerEntity);
                return "";
            }catch (Exception e){
                return e.getMessage();
            }
        });
        get("/hello", (request, response) -> {
            LOGGER.info("msg=hello");
            return "Hello World from controller!!!";
        });
    */}

}