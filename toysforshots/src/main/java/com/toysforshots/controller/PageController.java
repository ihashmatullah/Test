package com.toysforshots.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HashmatN on Oct, 2020
 */
@Controller
public class PageController {

  @RequestMapping("/")
  public String home() {
    return  "HelloWorld";
  }
}
