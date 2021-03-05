package books;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO : Add your import here
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BookShopTest {

    /**
     * TODO : Put your test here
     */

    BookShop shop;

    @BeforeAll
    public void setUp(){
        shop = new BookShop("Harry Potter Shop");
    }


    @Test
    public void myFirstTest(){
        int[] books = {1,2,4,0,3};
        // 4 Different Books -> Discount of 28%
        // 4*8 * 0,72 = 23,04 ----- Overflowing books = (0 + 1 + 3 + 0 + 2) * 8 = 48
        // Test should result a total of 48 + 23,04 = 71,04

        assertTrue(shop.cost(books) == 71.04);
    }

    @Test
    public void Three_Reduction(){
        int[] books = {7,4,0,5,0};
        // 3 Different Books -> Discount of 14%
        // 3*8 * 0,86 = 20,64 ----- Overflowing books = (6 + 3 + 0 + 4 + 0) * 8 = 104
        // Test should result a total of 20,64 + 104 = 124,64

        assertTrue(shop.cost(books) == 124.64);
    }

    @Test
    public void Five_Reduction(){
        int[] books = {7,4,3,5,4};
        // 5 Different Books -> Discount of 35%
        // 5*8 * 0,65 = 26 ----- Overflowing books = (6 + 3 + 2 + 4 + 3) * 8 = 144
        // Test should result a total of 26 + 144 = 170

        assertTrue(shop.cost(books) == 170);
    }

    @Test
    public void Two_Reduction(){
        int[] books = {15,0,9,0,0};
        // 2 Different Books -> Discount of 7%
        // 2*8 * 0,93 = 14,88 ----- Overflowing books = (14 + 0 + 8 + 0 + 0) * 8 = 176
        // Test should result a total of 14,88 + 176 = 190,88

        assertTrue(shop.cost(books) == 190.88);
    }

    @AfterAll
    public void tearDown(){
        shop = null;
    }


}