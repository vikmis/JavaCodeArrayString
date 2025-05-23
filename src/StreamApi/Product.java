package StreamApi;

public class Product {
	
    private String name;
    private double price;
    private String category;
    
    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
    	return price;
    
    }
    
    public String getCategory() {
    	return category; 
    	
    }
    
    @Override
    public String toString() {
        return name + " ($" + price + ") - " + category;
    }


}
