public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return this.pizza;
    }

    public void crearNuevaPizza() {
        this.pizza = new Pizza();
    }

    public abstract void buildMasa();

    public abstract void buildSalsa();

    public abstract void buildRelleno();

    @Override
    public String toString() {
        return "PizzaBuilder [pizza=" + pizza.toString() + "]";
    }

}
