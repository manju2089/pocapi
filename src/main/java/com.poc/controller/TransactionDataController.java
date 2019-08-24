package com.poc.controller;


import com.google.gson.Gson;
import com.poc.domain.model.entity.Car;
import com.poc.service.TransactionDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Rest API to consume transactions and calculate stats .
 */
@RestController
@Slf4j
@Configuration
public class TransactionDataController {

    @Autowired
    private TransactionDataService transactionStatsService;

    @Value("${username}")
    private String userCredential;

    @Value("${password}")
    private String passwordCredential;

    @PostMapping("/generateReport")
    public ModelAndView fetchReportModel(Model model){
        ModelAndView modelAndView = new ModelAndView("generateReport");
        List<Car> listCar = transactionStatsService.fetchData();
        Gson gson = new Gson();
        String formattedOut=gson.toJson(listCar);
        model.addAttribute("formattedOut",formattedOut );

        return modelAndView;
    }

    @GetMapping("/generateReport")
    public ModelAndView getReportModel(Model model,@RequestParam(value = "username", required = true) String username,@RequestParam(value = "password", required = true) String password){
        ModelAndView modelAndView = new ModelAndView("generateReport");
        if(userCredential.equals(username) && passwordCredential.equals(password)){
            return modelAndView;
        }
        else{
            return new ModelAndView("error");
        }
    }
}
