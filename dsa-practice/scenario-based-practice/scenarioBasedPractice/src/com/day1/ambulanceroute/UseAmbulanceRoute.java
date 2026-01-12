package com.day1.ambulanceroute;

public class UseAmbulanceRoute {
   public static void main(String[] args) {
	    AmbulanceRoute route=new AmbulanceRoute();
	    route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);
        
        route.removeUnit("Radiology");
        route.removeUnit("ICU");
        
        route.findAvailableUnit();
   }
}
