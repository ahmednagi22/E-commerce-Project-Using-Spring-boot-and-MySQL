package com.ecommerce.controller;


import com.ecommerce.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public ApiResponse HomeControllerHandler(){

        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("Welcome to my E-commerce");
        return apiResponse;

    }
}
