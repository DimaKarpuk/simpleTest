import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class TestUi {
    List<String> products = Arrays.asList("TV:1000:true", "Phone:800:false", "Headphones:400:true");

    @DisplayName("java lesson")
    @Test
    public void simpleTest() {
        List<ProductsModel> productsModels = products.stream().map(x -> {
            String[] parts = x.split(":");
            return new ProductsModel(parts[0], Integer.parseInt(parts[1]), Boolean.parseBoolean(parts[2]));
        }).collect(Collectors.toList());

        productsModels.stream().filter(x -> x.isColl() == true).map(x -> x.getNameProduct()).forEach(System.out::println);
    }
}
