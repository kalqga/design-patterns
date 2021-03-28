package visitor;

public interface Product {
    int accept(ShoppingCartVisitor visitor);
}
