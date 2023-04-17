package com.payroll.citipayroll.model;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{

    private final String ROLE = "Manager";
    public List<Payroll> listPayroll;

    public Manager() {
        this.listPayroll = new ArrayList<>();
    }

    public String getROLE() {
        return ROLE;
    }

    public List<Payroll> getListPayroll() {
        return listPayroll;
    }

    public void setListPayroll(List<Payroll> listPayroll) {
        this.listPayroll = listPayroll;
    }
}
