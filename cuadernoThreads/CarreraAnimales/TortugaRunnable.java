public class TortugaRunnable implements Runnable {

    

    public void run(){
        int contadorPasos = 0;
        int i=0;
        int pasos=0;
        int meta = 5000;
        System.out.println("La tortuga corre");
        while(contadorPasos < meta){
            try {
                pasos = (int)(Math.random()*5+1);
                Thread.sleep(pasos);
                System.out.println("Tortuga corre a la velocidad de "+pasos+" pasos");
                contadorPasos = pasos + contadorPasos;
                System.out.println("Tortuga lleva " + contadorPasos + " pasos");
            } catch (Exception e) {
               e.printStackTrace();
            }
        
    
          
        }
        System.out.println("Termina la tortuga");

    }

}
