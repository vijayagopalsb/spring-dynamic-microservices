package com.example.paymentservicepaypal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PaymentServiceTest {
  @Test
  void shouldReturnSuccess() {
    PaymentService service = new PaymentService();
    assertEquals("Success", service.process());
  }
}
