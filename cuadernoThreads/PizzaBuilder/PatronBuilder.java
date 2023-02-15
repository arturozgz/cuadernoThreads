public class PatronBuilder {

    //ESTO ES EL MAIN PARA CREAR LAS PIZZAS QUE NOS PIDEN 
    public static void main(String[] args) {
        Cocina cocina = Cocina.getInstance();
        
   
        PizzaBuilder picantePizza = new PicantePizzaBuilder();
        PizzaBuilder barbacoaPizza = new BarbacoaPizzaBuilder();
        PizzaBuilder carbonaraPizza = new CarbonarayPolloPizzaBuilder();
        
        //"CONSTRUIMOS LA PIZZA Y NOS PONDRÁ LOS INGREDIENTES SELECCIONADOS SEGUN LA PIZZA ELEGIDA"
        cocina.setPizzaBuilder(picantePizza);
        cocina.construirPizza();

        cocina.setPizzaBuilder(barbacoaPizza);
        cocina.construirPizza();

        cocina.setPizzaBuilder(carbonaraPizza);
        cocina.construirPizza();
        
        
        
    }
    
}
