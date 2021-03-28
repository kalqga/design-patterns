package factorymethod;

public class MilkFactory extends FarmFactory {

    @Override
    public FarmProduct createProduct(String name) {
        FarmProduct product = null;

        if(name == "COW_MILK") {
            product = new CowMilk();
            product.setPrice(1.55);
        }

        if(name == "GOAT_MILK") {
            product = new GoatMilk();
            product.setPrice(2.65);
        }

        if(product == null) {
            System.out.println("Cannot create product: " + name);
        }

        return product;
    }

}
