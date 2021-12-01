package School.Citytech.properties.model;

import java.util.Arrays;

public class Properties {
    private float count = 0;



    private Data[] investments;

    public float getCount() {
        return count;
    }

    public void setCount(float count) {
        this.count = count;
    }

    public Data[] getInvestments() {
        return investments;
    }

    public void setInvestments(Data[] investments) {
        this.investments = investments;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "count=" + count +
                ", investments=" + Arrays.toString(investments) +
                '}';
    }
}

