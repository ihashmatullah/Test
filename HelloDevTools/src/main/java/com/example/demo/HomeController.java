package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HashmatN on Sep, 2020
 */

@RestController
public class HomeController {

  @Value("${homeController.msg}")
  private  String homeControllerMsg;

  @RequestMapping("/")
  public String home() {
    return  homeControllerMsg;
  }
}
