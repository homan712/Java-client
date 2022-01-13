package School.Citytech.properties.model;

public class Data {
    private float netIncome = 0;
    private float expense = 0;
    private float occupancy = 0;
    private float grossIncome = 0;
    private float investmentCost = 0;
    private float id = 0;

    public float getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(float netIncome) {
        this.netIncome = netIncome;
    }

    public float getExpense() {
        return expense;
    }

    public void setExpense(float expense) {
        this.expense = expense;
    }

    public float getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(float occupancy) {
        this.occupancy = occupancy;
    }

    public float getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(float grossIncome) {
        this.grossIncome = grossIncome;
    }

    public float getInvestmentCost() {
        return investmentCost;
    }

    public void setInvestmentCost(float investmentCost) {
        this.investmentCost = investmentCost;
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PropertyID{" +
                "netIncome=" + netIncome +
                ", expense=" + expense +
                ", occupancy=" + occupancy +
                ", grossIncome=" + grossIncome +
                ", investmentCost=" + investmentCost +
                ", id=" + id +
                '}';
    }
}
