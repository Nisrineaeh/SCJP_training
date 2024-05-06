package DeclarationAndAccessControl.Food;

import DeclarationAndAccessControl.Ingredient.*;

public class food extends Fruit {

    public food(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        throw new UnsupportedOperationException("Unimplemented method 'displayInfo'");
    }
    
}
