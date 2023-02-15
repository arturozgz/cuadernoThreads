
import java.util.ArrayList;

public class Jefe extends Personaje implements Runnable {

    ArrayList<Caco> caco = new ArrayList<Caco>();
    private Mesa mesa;

    public Jefe(Mesa mesa) {
        super("Jefe");
        this.mesa = mesa;
    }

    @Override
    public void run() {
        while (true) {
            if (Mesa.acabar) {
                break;
            }
            mesa.comer(this);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}
