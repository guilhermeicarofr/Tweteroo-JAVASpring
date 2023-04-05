package com.tweteroo.tweteroo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.tweteroo.dto.UserDTO;
import com.tweteroo.tweteroo.service.AuthService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/sign-up")
public class AuthController {
  @Autowired
  private AuthService service;

  @PostMapping
  public String signUp(@RequestBody @Valid UserDTO body) {
    service.signUp(body);
    return("OK");
  }
}