package com.payroll.citipayroll.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private static final String ORGANIZATION = "CITI-BANK";
    public List<Payroll> listPayroll;

    public Employee() {
        this.listPayroll = new ArrayList<>();
    }
}
