package org.gordianknots.equipmentapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @GetMapping
  String hello() {
    return "Hello Equipment API!";
  }
}
