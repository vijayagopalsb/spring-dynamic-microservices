package com.example.paymentservicepaypal;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(TestController.class)
public class PaymentControllerTest {
  
  @Autowired
  private MockMvc mockMvc;

  @Test
  void testGetPaymentStatus() throws Exception {
    mockMvc.perform(get("/api/payments/status"))
           .andExpect(status().isOk());
  }
}
