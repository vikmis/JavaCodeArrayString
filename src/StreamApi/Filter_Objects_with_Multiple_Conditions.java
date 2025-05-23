package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Objects_with_Multiple_Conditions {
	
	public static void main(String[] args) {
		
        List<Product> products = Arrays.asList(
                new Product("Laptop", 999.99, "Electronics"),
                new Product("Book", 15.99, "Education"),
                new Product("Phone", 699.99, "Electronics"),
                new Product("Pen", 2.99, "Stationery")
            );
        
       List<Product> filteredProducts = products.stream().filter(p->p.getCategory()=="Electronics"&& p.getPrice()>500)
        .collect(Collectors.toList());
       
       System.out.println("Filtered Proiducts: "+filteredProducts);
        
       filteredProducts.forEach(System.out::println);
	}

}
