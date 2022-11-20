package com.github.billy.securitybreach8.service;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Employee {

  private static final double MINIMUM_WAGE = 1_000_000;
  private final String name;
  private final double salary;

  public Employee(String name, double salary) {
    this.name = name;
    if (salary < MINIMUM_WAGE) {
      throw new IllegalStateException("Salary cannot be below the minimum wage");
    }
    this.salary = salary;
  }
}
