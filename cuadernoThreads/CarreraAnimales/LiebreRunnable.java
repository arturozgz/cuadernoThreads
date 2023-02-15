public class LiebreRunnable implements Runnable {

    public void run() {
        int contadorPasos = 0;
        int i = 0;
        int pasos = 0;
        int meta = 5000;
        System.out.println("La liebre corre");
        while (contadorPasos < meta) {
            try {
                pasos = (int) (Math.random() * 5 + 1);
                Thread.sleep(pasos);
                System.out.println("Liebre corre a la velocidad de " + pasos + " pasos");
                contadorPasos = pasos + contadorPasos;
                System.out.println("Liebre lleva " + contadorPasos + " pasos");
            } catch (Exception e) {
                e.printStackTrace();
            }
          

        }
        System.out.println("Ha ganado la liebre");
    }

}
