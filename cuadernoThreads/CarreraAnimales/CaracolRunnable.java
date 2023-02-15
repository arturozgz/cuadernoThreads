public class CaracolRunnable implements Runnable {
    public void run(){
        int i=0;
        int pasos=0;
        System.out.println("La Caracol corre");
        while(i<5){
            try {
                pasos = (int)(Math.random()*5+1)*1000;
                Thread.sleep(pasos);
                System.out.println("Caracol corre a la velocidad de "+pasos+" pasos");
            } catch (Exception e) {
               e.printStackTrace();
            }
            i++;
    
          
        }
        System.out.println("Termina la caracol");
    }

}
