public class BarbacoaPizzaBuilder extends PizzaBuilder{

    @Override
    public void buildMasa() {
        super.pizza.setMasa("suave");
    }

    @Override
    public void buildSalsa() {
        super.pizza.setSalsa("barbacoa");
    }

    @Override
    public void buildRelleno() {
        super.pizza.setRelleno("pollo+carne");
    }
    
}
