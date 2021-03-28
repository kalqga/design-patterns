package visitor;

public class VisitorMain {

    public static void main(String[] args) {

        Product apple = new Fruit("Apple", 2, 4);
        Product banana = new Fruit("Banana", 3, 2);
        Product book = new Book("1918AJHDH9", 70);

        ShoppingCartVisitor shoppingCart = new ShoppingCart();

        int overallPrice = 0;
        overallPrice = overallPrice + apple.accept(shoppingCart);
        overallPrice = overallPrice + banana.accept(shoppingCart);
        overallPrice = overallPrice + book.accept(shoppingCart);

        System.out.println("Overall price: " + overallPrice);

    }

}
