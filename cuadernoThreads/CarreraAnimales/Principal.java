/**
 * Principal
 */
public class Principal {

    public static void main(String[] args) {
        // LiebreRunnable liebre = new LiebreRunnable();
        // CaracolRunnable caracol = new CaracolRunnable();
        // CucarachaRunnable cucaracha = new CucarachaRunnable();
        // AlbertoRunnable albert = new AlbertoRunnable();
        // TortugaRunnable tortuga = new TortugaRunnable();

        // LiebreRunnable HiloLiebre= new LiebreRunnable();

        boolean finishLiebre = false;

        new Thread(new LiebreRunnable()).start();
        new Thread(new TortugaRunnable()).start();

        if(finishLiebre == false){
           //desconectar los metodos thread 
        }
    }

}