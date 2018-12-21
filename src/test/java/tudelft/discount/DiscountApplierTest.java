package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {

    @Test
    void apply_discount_home() {
        test("HOME", 100, 90);
    }

    @Test
    void apply_discount_business() {
        test("BUSINESS", 100, 110);
    }

    private void test(String category, float price, float expectedDiscountedprice) {
        Product product = new Product("anyName", price, category);

        ProductDao dao = Mockito.mock(ProductDao.class);

        List<Product> products = Arrays.asList(product);
        Mockito.when(dao.all()).thenReturn(products);

        DiscountApplier discounter = new DiscountApplier(dao);
        discounter.setNewPrices();

        Assertions.assertEquals(expectedDiscountedprice, products.get(0).getPrice());
    }

}
