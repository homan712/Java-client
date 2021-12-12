package School.Citytech.states;

public class TriState {
    private String state;
    private float stateCount;
    private float sumOfNetIncome;

    public TriState(String state, float stateCount, float sumOfNetIncome) {
        this.state = state;
        this.stateCount = stateCount;
        this.sumOfNetIncome = sumOfNetIncome;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public float getStateCount() {
        return stateCount;
    }

    public void setStateCount(float stateCount) {
        this.stateCount = stateCount;
    }

    public float getSumOfNetIncome() {
        return sumOfNetIncome;
    }

    public void setSumOfNetIncome(float sumOfNetIncome) {
        this.sumOfNetIncome = sumOfNetIncome;
    }

    @Override
    public String toString() {
        return "TriState{" +
                "state='" + state + '\'' +
                ", stateCount=" + stateCount +
                ", sumOfNetIncome=" + sumOfNetIncome +
                '}';
    }
}
