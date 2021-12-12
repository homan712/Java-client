package School.Citytech.states;

import School.Citytech.retirement.model.Retirement;
import com.jbbwebsolutions.http.utility.JSONGet;

import java.util.stream.Stream;

public class TriStateDataLayer {


    public static TriState[] getData(String... states) {
        var queryString = String.join(",", states);
        String sURL = "http://localhost:9615/allStates?states=" + queryString;
        if(states.length == 0){
            sURL = "http://localhost:9615/allStates";
        }
        System.out.println(sURL);
        var retirementData = JSONGet.submitGet(sURL, TriState[].class);
        return retirementData;

    }

    public static void main(String[] args){
        var states = TriStateDataLayer.getData("NY","CT","NJ");
        Stream.of(states).forEach(System.out::println);
    }
}
