package com.github.billy.securitybreach8.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmployeeTest {

  @Test
  void canCreateEmployee() {
    assertNotNull(new Employee("John", 1_500_000));
  }

  @Test
  void whenSalaryBelowMW_ThrowIllegalStateException() {
    Exception exception = assertThrows(IllegalStateException.class,
        () -> new Employee("John", 500_000));
    assertTrue(exception.getMessage().contains("Salary cannot be below the minimum wage"));
  }
}