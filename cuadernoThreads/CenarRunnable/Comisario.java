public class Comisario extends Personaje implements Runnable {

    private float sobornoMes;
    private Jefe jefe;
    private Mesa mesa;

    public Comisario(float soborno, Jefe jefe, Mesa mesa) {
        super("Comisario");
        this.sobornoMes = soborno;
        this.jefe = jefe;
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

    public float getSobornoMes() {
        return sobornoMes;
    }

    public void setSobornoMes(float soborno) {
        this.sobornoMes = soborno;
    }

    public Jefe getJefe() {
        return jefe;
    }

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }

}

