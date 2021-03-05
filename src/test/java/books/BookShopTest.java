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
        // 4*8 * 0,72 = 23,04 ----- Overflowing books = (0 + 1 + 3 + 0 + 2) * 8 = 48
        // Test should result a total of 48 + 23,04 = 71,04

        assertTrue(shop.cost(books) == 71.04);
    }

    @Test
    public void Three_Reduction(){
        BookShop shop = new BookShop("Harry Potter Shop");
        int[] books = {7,4,0,5,0};
        // 3 Different Books -> Discount of 14%
        // 3*8 * 0,86 = 20,64 ----- Overflowing books = (6 + 3 + 0 + 4 + 0) * 8 = 104
        // Test should result a total of 20,64 + 104 = 124,64

        assertTrue(shop.cost(books) == 124.64);
    }
}