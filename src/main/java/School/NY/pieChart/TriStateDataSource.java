package School.Citytech.pieChart;

import java.util.ArrayList;
import java.util.List;

public class TriStateDataSource {

    public static List<RealEstate> getData(){
        List list = new ArrayList<RealEstate>();
        list.add(new RealEstate("NY", 50_000));
        list.add(new RealEstate("NJ", 40_000));
        list.add(new RealEstate("CT", 30_000));



        return list;

    }
}
