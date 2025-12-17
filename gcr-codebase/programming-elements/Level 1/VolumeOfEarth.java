

import java.util.Scanner;

public class VolumeOfEarth {
    public static void main(String[] args) {
        //Radius of Earth in kilometres
        int radiusInKm=6378;

        final double PI=3.14;
        double radiusInMiles=0.621371;
        //calculate the volume of earth
        double volumeInCubicKM=(4*PI*Math.pow(radiusInKm,3))/3;
        double volumeInCubicMiles=(4*PI*Math.pow(radiusInMiles,3))/3;

        //print the volume of earth in cubic km and cubic miles
        System.out.println("The volume of earth in cubic kilometres is "+volumeInCubicKM+" and cubic mile is "+volumeInCubicMiles);
    }
}
