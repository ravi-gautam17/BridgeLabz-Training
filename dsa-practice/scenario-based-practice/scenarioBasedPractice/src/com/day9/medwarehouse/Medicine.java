package com.day9.medwarehouse;

import java.time.LocalDateTime;

public class Medicine {
   String medId;
   LocalDateTime expiry;
   public Medicine(String medId,String time) {
	   this.medId=medId;
	   LocalDateTime temp=LocalDateTime.parse(time);
	   this.expiry=temp;
   }
}
