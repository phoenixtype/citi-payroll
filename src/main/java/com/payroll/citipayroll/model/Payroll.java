package com.payroll.citipayroll.model;

import java.time.LocalDateTime;

public class Payroll {
    private int basePay;
    private int bonus;
    private LocalDateTime payrollHistory;

    public Payroll(int basePay, int bonus, LocalDateTime payrollHistory) {
        this.basePay = basePay;
        this.bonus = bonus;
        this.payrollHistory = payrollHistory;
    }

    public int totalCompensation(int basePay, int bonus) {
        int compensation = basePay + bonus;
        return compensation;
    }

    public int getBasePay() {
        return basePay;
    }

    public void setBasePay(int basePay) {
        this.basePay = basePay;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public LocalDateTime getPayrollHistory() {
        return payrollHistory;
    }

    public void setPayrollHistory(LocalDateTime payrollHistory) {
        this.payrollHistory = payrollHistory;
    }
}
