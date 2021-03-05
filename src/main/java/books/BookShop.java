package books;

public class BookShop {

    private final String name;

    /**
     * Constructor of the class Book shop
     * @param name name of the book shop
     */
    public BookShop(String name){
        this.name = name;
    }

    /**
     * method to compute the cost of a basket
     * @param books array corresponding to the number of each harry potter book the client desire to buy (books.length should return 5)
     * @return the cost in euro with the discount
     */
    public double cost(int[] books){
        int count = 0;
        double total = 0;
        double reducedTotal = 0;

        for(int i = 0; i < books.length; i++){
            if(books[i] > 0){
                count++;
                if(books[i] == 1){
                    reducedTotal+= 8;
                } else {
                    reducedTotal+= 8;
                    total += (books[i] - 1) * 8;
                }
            }
        }

        switch(count){
            case 2:
                reducedTotal *= 0.93;
                break;
            case 3:
                reducedTotal *= 0.86;
                break;
            case 4:
                reducedTotal *= 0.72;
                break;
            case 5:
                reducedTotal *= 0.65;
                break;
            default:
                break;
        }
        return total + reducedTotal;
    }
}
