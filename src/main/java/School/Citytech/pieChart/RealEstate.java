package School.Citytech.pieChart;

public class RealEstate {
    private String state;
    private float amount;

    public RealEstate(String state, float amount) {
        this.state = state;
        this.amount = amount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "state='" + state + '\'' +
                ", amount=" + amount +
                '}';
    }
}
