package collectors.orderrevenuesummary;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderRevenueApp {
   public static void main(String[] args) {
	   List<Order> orders = List.of(
			    new Order("Alice", 250.0),
			    new Order("Bob", 150.0),
			    new Order("Alice", 300.0),
			    new Order("Bob", 100.0),
			    new Order("Charlie", 200.0)
			);
	   Map<String, Double> revenuePerCustomer =
		        orders.stream()
		              .collect(Collectors.groupingBy(
		                  Order::getCustomer,
		                  Collectors.summingDouble(Order::getTotal)
		              ));
	   revenuePerCustomer.forEach((customer, total) ->
	    System.out.println(customer + " : " + total)
	);


   }
}
