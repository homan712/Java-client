package School.Citytech.retirement.model;

import java.util.Arrays;

public class Retirement {
    private float daily20Days = 0;
    private float daily30days = 0;
    private float monthlyDeposit = 0;
    private float startingBalance = 0;
    private float yearsDeposit = 0;

    private Year [] years;

    public float getDaily20Days() {
        return daily20Days;
    }

    public void setDaily20Days(float daily20Days) {
        this.daily20Days = daily20Days;
    }

    public float getDaily30days() {
        return daily30days;
    }

    public void setDaily30days(float daily30days) {
        this.daily30days = daily30days;
    }

    public float getMonthlyDeposit() {
        return monthlyDeposit;
    }

    public void setMonthlyDeposit(float monthlyDeposit) {
        this.monthlyDeposit = monthlyDeposit;
    }

    public float getStartingBalance() {
        return startingBalance;
    }

    public void setStartingBalance(float startingBalance) {
        this.startingBalance = startingBalance;
    }

    public float getYearsDeposit() {
        return yearsDeposit;
    }

    public void setYearsDeposit(float yearsDeposit) {
        this.yearsDeposit = yearsDeposit;
    }

    public Year[] getYears() {
        return years;
    }

    public void setYears(Year[] years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Retirement{" +
                "daily20Days=" + daily20Days +
                ", daily30days=" + daily30days +
                ", monthlyDeposit=" + monthlyDeposit +
                ", startingBalance=" + startingBalance +
                ", yearsDeposit=" + yearsDeposit +
                ", years=" + Arrays.toString(years) +
                '}';
    }
}

