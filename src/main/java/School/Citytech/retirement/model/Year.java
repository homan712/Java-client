package School.Citytech.retirement.model;

public class Year {
    private float endingBalance = 0;
    private float InterestedEarned = 0;
    private float no = 0;
    private float startingBalance = 0;
    private float yearlyDeposit = 0;

    public float getEndingBalance() {
        return endingBalance;
    }

    public void setEndingBalance(float endingBalance) {
        this.endingBalance = endingBalance;
    }

    public float getInterestedEarned() {
        return InterestedEarned;
    }

    public void setInterestedEarned(float interestedEarned) {
        InterestedEarned = interestedEarned;
    }

    public float getNo() {
        return no;
    }

    public void setNo(float no) {
        this.no = no;
    }

    public float getStartingBalance() {
        return startingBalance;
    }

    public void setStartingBalance(float startingBalance) {
        this.startingBalance = startingBalance;
    }

    public float getYearlyDeposit() {
        return yearlyDeposit;
    }

    public void setYearlyDeposit(float yearlyDeposit) {
        this.yearlyDeposit = yearlyDeposit;
    }

    @Override
    public String toString() {
        return "Year{" +" no=" + no +
                ", startingBalance=" + startingBalance +
                ", yearlyDeposit=" + yearlyDeposit +
                "endingBalance=" + endingBalance +
                ", InterestedEarned=" + InterestedEarned +
                '}';
    }
}
