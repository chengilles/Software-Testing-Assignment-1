package books;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO : Add your import here
 */

public class BookShopTest {

    /**
     * TODO : Put your test here
     */

    @Test
    public void myFirstTest(){
        BookShop shop = new BookShop("Harry Potter Shop");
        int[] books = {1,2,4,0,3};
        // 4 Different Books -> Discount of 28%
        // 4*8 * 0,72 = 23,04 ----- Overflowing books = 6 * 8 = 48
        // Test should result a total of 48 + 23,04 = 71,04

        assertTrue(shop.cost(books) == 71.04);
    }
}