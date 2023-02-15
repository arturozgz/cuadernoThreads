public class Main {

    public static void main(String[] args) {

        // creamos los personajes

        Mesa mesa = new Mesa();
        Jefe jefe = new Jefe(mesa);
        Comisario comisario = new Comisario(4000, jefe, mesa);
        Caco caco1 = new Caco("caco1", 30, mesa);
        Caco caco2 = new Caco("caco2", 25, mesa);
        Caco caco3 = new Caco("caco3", 20, mesa);

        Thread comerJefe = new Thread(jefe);
        Thread comerComisario = new Thread(comisario);
        Thread comerCaco = new Thread(caco1);
        Thread comerCaco2 = new Thread(caco2);
        Thread comerCaco3 = new Thread(caco3);

        comerJefe.start();
        comerComisario.start();
        comerCaco.start();
        comerCaco2.start();
        comerCaco3.start();

    }
}