package School.Citytech.retirement;

import School.Citytech.retirement.model.Retirement;

import com.jbbwebsolutions.http.utility.JSONGet;

import java.util.stream.Stream;

public class RetirementDataLayer {

    public static Retirement getRetirement() {
        String sURL = "http://localhost:9814/retirement";
        var retirementData = JSONGet.submitGet(sURL, Retirement.class);
        return retirementData;
    }

    public static void main(String[] args){
        var years = RetirementDataLayer.getRetirement().getYears();
        Stream.of(years).forEach(System.out::println);
    }
}
