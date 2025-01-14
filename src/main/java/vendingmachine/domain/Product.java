package vendingmachine.domain;

import vendingmachine.utils.Validator;

public class Product {
    String name;
    int price;
    int quantity;

    public Product(String name, String price, String quantity) {
        this.name = name;
        Validator.validateNumber(price);
        Validator.validateNumber(quantity);

        Validator.validateProductPrice(price);
        this.price = Integer.parseInt(price);
        this.quantity = Integer.parseInt(quantity);
    }

    public boolean checkQuantityEnough() {
        return quantity > 0;
    }

    public void reduceQuantity() {
        quantity -= 1;
    }

    public boolean checkPurchasePossible(int restMoney) {
        return restMoney >= price;
    }


}
