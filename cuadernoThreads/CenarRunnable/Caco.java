public class Caco extends Personaje implements Runnable {

    private float salario_dia;
    private Mesa mesa;

    public Caco(String nombre, float salario_dia, Mesa mesa) {
        super(nombre);
        this.salario_dia = salario_dia;
        this.mesa = mesa;
    }

    public float getsalario_dia() {
        return salario_dia;
    }

    public void setsalario_dia(float salario_dia) {
        this.salario_dia = salario_dia;
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
