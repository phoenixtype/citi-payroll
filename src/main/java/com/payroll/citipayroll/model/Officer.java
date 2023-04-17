package com.payroll.citipayroll.model;


import java.util.ArrayList;
import java.util.List;

public class Officer extends Employee{
    private final String ROLE = "Officer";
    public List<Payroll> listPayroll;
    public Officer() {
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
