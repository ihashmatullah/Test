package com.example.profilesdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HashmatN on Oct, 2020
 */
@RestController
public class PageController {

  @Value("${spring.profiles.active}")
  private  String environment;

  @Value("${msg}")
  private String msg;

  @Value("${pageController.msg}")
  private String msgFromYMLfile;

  @RequestMapping("/")
  public String home() {
    return msg;
  }
}
