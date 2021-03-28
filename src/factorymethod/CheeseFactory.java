package factorymethod;

public class CheeseFactory extends FarmFactory {

    @Override
    public FarmProduct createProduct(String name) {

        FarmProduct product = null;

        if(name == "COW_CHEESE") {
            product = new CowCheese();
            product.setPrice(2.55);
        }

        if(name == "GOAT_CHEESE") {
            product = new GoatCheese();
            product.setPrice(4.55);
        }

        if(product == null) {
            System.out.println("Cannot create product: " + name);
        }

        return product;

    }

}
