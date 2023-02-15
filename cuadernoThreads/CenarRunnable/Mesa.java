import java.util.Random;

public class Mesa {
    // declaramos las porciones y el estado de cada una de las pizzas
    private static int porBarbacoa = 24;
    private static int porCarbonara = 24;
    private static int porPicante = 24;
    private static int porPollo = 24;

    private static boolean bbq;
    private static boolean picante;
    private static boolean carbonara;
    private static boolean pollo;

    public static boolean acabar = false;
    private Random numAleatorio = new Random();

    public Mesa() {
        carbonara = false;
        bbq = false;
        pollo = false;
        picante = false;
    }

    public synchronized void comer(Personaje p) {

        if (porBarbacoa != 0 && porCarbonara != 0 && porPicante != 0 && porPollo != 0) {

            int num = numAleatorio.nextInt(5);

            switch (num) {
                case 1:
                    if (porCarbonara != 0) {
                        if (carbonara) {
                            try {
                                wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        System.out.println(p.getNombre() + " comiendo carbonara " + (porCarbonara - 1) + " restantes");
                        carbonara = true;

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        notify();

                        carbonara = false;
                        porCarbonara--;
                    } else {
                        System.out.println("La carbonara se ha acabado");
                    }
                    break;

                case 2:
                    if (porBarbacoa != 0) {
                        if (bbq) {
                            try {
                                wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        System.out.println(
                                p.getNombre() + " comiendo bbq " + (porBarbacoa - 1) + " restantes");
                        bbq = true;

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        notify();

                        bbq = false;
                        porBarbacoa--;
                    } else {
                        System.out.println("La Barbacoa se ha acabado");
                    }
                    break;

                case 3:

                    if (porPollo != 0) {
                        if (pollo) {
                            try {
                                wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        System.out.println(
                                p.getNombre() + " comiendo pollo " + (porPollo - 1) + " restantes");
                        pollo = true;

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        notify();

                        pollo = false;
                        porPollo--;
                    } else {
                        System.out.println("Pollo se ha acabado");
                    }
                    break;

                case 4:
                    if (porPicante != 0) {
                        if (picante) {
                            try {
                                wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        System.out.println(
                                p.getNombre() + " comiendo picante " + (porPicante - 1) + " restantes");
                        picante = true;

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        notify();

                        picante = false;
                        porPicante--;
                    } else {
                        System.out.println("Picante se ha acabado");
                    }
                    break;

            }
        } else {
            acabar = true;
        }

    }

    public static boolean isacabar() {
        return acabar;
    }

    public static void setacabar(boolean acabar) {
        Mesa.acabar = acabar;
    }

}
