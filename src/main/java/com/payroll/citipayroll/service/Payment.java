package com.payroll.citipayroll.service;

import com.payroll.citipayroll.model.Manager;
import com.payroll.citipayroll.model.Officer;
import com.payroll.citipayroll.model.Payroll;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

public class Payment {

    @Autowired
    Officer officer;

    @Autowired
    Payroll payroll;

    @Autowired
    Manager manager;

    public void pay() {
        if (officer.getROLE() == "Officer") {
            payroll = new Payroll(1000, 200, LocalDateTime.now());
            officer.listPayroll.add(payroll);
        }

        if (manager.getROLE() == "Manager") {
            payroll = new Payroll(1500, 300, LocalDateTime.now());
            manager.listPayroll.add(payroll);
        }
    }

    public int totalPay() {
        AtomicInteger sumPay = new AtomicInteger();

        if (officer.getROLE() == "Officer") {
            for (int i = 0; i < officer.listPayroll.size(); i++) {
                officer.listPayroll.stream().forEach(
                        payroll -> {
                            sumPay.addAndGet(payroll.totalCompensation(payroll.getBasePay(), payroll.getBonus()));}
                );
            }
            return sumPay.intValue();
        }

        if (manager.getROLE() == "Manager") {
            for (int i = 0; i < manager.listPayroll.size(); i++) {
                manager.listPayroll.stream().forEach(
                        payroll -> {
                            sumPay.addAndGet(payroll.totalCompensation(payroll.getBasePay(), payroll.getBonus()));}
                );
            }
            return sumPay.intValue();
        }

        return 0;
    }
}