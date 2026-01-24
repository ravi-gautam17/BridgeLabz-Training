package collections.shoppingcart;

import java.util.*;
public class ShoppingCart {
    public static void main(String[] args) {
    	HashMap<String,Integer> priceList=new HashMap<>();
    	
    	priceList.put("Apple", 100);
    	priceList.put("Banana", 40);
    	priceList.put("Milk", 60);
    	priceList.put("Bread", 50);
    	
    	LinkedHashMap<String, Integer> cart = new LinkedHashMap<>();

    	cart.put("Milk", priceList.get("Milk"));
    	cart.put("Apple", priceList.get("Apple"));
    	cart.put("Bread", priceList.get("Bread"));

    	System.out.println("Cart (Insertion Order):");
    	cart.forEach((item, price) ->
    	    System.out.println(item + " → ₹" + price)
    	);

    	TreeMap<Integer, List<String>> sortedByPrice = new TreeMap<>();

    	for (Map.Entry<String,Integer> entry: cart.entrySet()) {
    	    sortedByPrice
    	        .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
    	        .add(entry.getKey());
    	}
    	
    	System.out.println("\nCart Sorted by Price:");
    	sortedByPrice.forEach((price, items) ->
    	    System.out.println("₹" + price + " → " + items)
    	);


    }
}
