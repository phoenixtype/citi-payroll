package com.payroll.citipayroll;

import com.payroll.citipayroll.model.Payroll;
import com.payroll.citipayroll.service.Payment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CitiPayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitiPayrollApplication.class, args);
		Payment payment =  new Payment();
		payment.pay();
		payment.totalPay();
	}
}
