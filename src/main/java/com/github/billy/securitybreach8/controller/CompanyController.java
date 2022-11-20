package com.github.billy.securitybreach8.controller;

import com.github.billy.securitybreach8.service.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/company")
public class CompanyController {

  @PostMapping("/register-employee")
  public void registerEmployee(@RequestBody Employee employee) {
    log.info(employee.toString());
  }
}
