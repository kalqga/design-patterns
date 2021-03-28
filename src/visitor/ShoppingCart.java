package visitor;

public class ShoppingCart implements ShoppingCartVisitor {

    @Override
    public int visit(Book book) {
        int bookPrice = book.getPrice();
        if(bookPrice > 50) {
            bookPrice = bookPrice - 5;
        }
        System.out.println("Book: " + book.getIsbnNumber() + " will cost " + bookPrice);
        return bookPrice;
    }

    @Override
    public int visit(Fruit fruit) {
        int fruitPrice = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println("Fruit: " + fruit.getName() + " will cost " + fruitPrice);
        return fruitPrice;
    }

}
