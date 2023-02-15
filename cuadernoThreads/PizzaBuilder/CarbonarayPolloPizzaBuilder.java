public class CarbonarayPolloPizzaBuilder extends PizzaBuilder{

    @Override
    public void buildMasa() {
        super.pizza.setMasa("fina");
    }

    @Override
    public void buildSalsa() {
        super.pizza.setSalsa("carbonara");
    }

    @Override
    public void buildRelleno() {
        super.pizza.setRelleno("carbonara y pollo");
    }
    
}
