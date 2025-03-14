public class App {
    public static void main(String[] args) throws Exception {
    
        Cachorro c = new Cachorro();

        System.out.println("-----");
        c.reagir("Olá");

        System.out.println("-----");
        c.reagir("Vai apanhar!");

        System.out.println("-----");
        c.reagir(11,45);
        c.reagir(19,00);

        System.out.println("-----");
        c.reagir(false);
    }
}
