package generics.smartwarehousesystem;

public class Furniture extends WarehouseItem{
	
	public Furniture(String name, int quantity) {
		super(name, quantity);
	}
	
	@Override
	public String getCategory() {
		return "Furniture";
	}
}
