import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class ProductStatisticsTest {

    @Test
    void getTopProducts() {
        ProductStatistics pstas=new ProductStatistics();
        ArrayList<Product> inputProducts=new ArrayList<>();
        inputProducts.add(new Product(1,"Iphone X", 583,"Gary V"));
        inputProducts.add(new Product(2,"Galaxy S8", 942,"Alex Lee"));
        inputProducts.add(new Product(3,"Galaxy S8", 623,"Gary V"));

        pstas.populateList(inputProducts);

        Map<String, Integer> testMap=new HashMap<>();
        testMap.put("Galaxy S8",2);
        testMap.put("Iphone X",1);


        Map<String, Integer> prods = pstas.getTopProducts();
        assertEquals(testMap,prods);

    }

    @org.junit.jupiter.api.Test
    void getBiggestSpenders() {
        ProductStatistics pstas=new ProductStatistics();
        ArrayList<Product> inputProducts=new ArrayList<>();
        inputProducts.add(new Product(1,"Iphone X", 583,"Gary V"));
        inputProducts.add(new Product(2,"Galaxy S8", 942,"Alex Lee"));
        inputProducts.add(new Product(3,"Galaxy S8", 623,"Gary V"));

        pstas.populateList(inputProducts);

        Map<String, Integer> testMap=new HashMap<>();
        testMap.put("Gary V",(623+583));
        testMap.put("Alex Lee",942);


        Map<String, Integer> prods = pstas.getBiggestSpenders();
        assertEquals(testMap,prods);

    }

    @org.junit.jupiter.api.Test
    void getTopBuyers() {
        ProductStatistics pstas=new ProductStatistics();
        ArrayList<Product> inputProducts=new ArrayList<>();
        inputProducts.add(new Product(1,"Iphone X", 583,"Gary V"));
        inputProducts.add(new Product(2,"Galaxy S8", 942,"Alex Lee"));
        inputProducts.add(new Product(3,"Galaxy S8", 623,"Gary V"));

        pstas.populateList(inputProducts);

        Map<String, Integer> testMap=new HashMap<>();
        testMap.put("Gary V", 2);
        testMap.put("Alex Lee", 1);


        Map<String, Integer> prods = pstas.getTopBuyers();
        assertEquals(testMap,prods);
    }
}