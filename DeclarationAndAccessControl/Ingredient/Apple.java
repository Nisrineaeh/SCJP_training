package DeclarationAndAccessControl.Ingredient;

class Apple extends Fruit {
    private String variety;

    public Apple(String name, String variety) {
        super(name);
        this.variety = variety;
    }

    @Override
    public void displayInfo() {
        System.out.println("Variété de pomme: " + variety);}
}

