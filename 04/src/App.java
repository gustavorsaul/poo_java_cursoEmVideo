public class App {
    public static void main(String[] args) throws Exception {
        
        // metodos acessores

            // getters
            // setter
            // construct

        // Caneta c1 = new Caneta();
        Caneta c1 = new Caneta("BIC", "Azul", 0.4f);

        //c1.setModelo("BIC");     
        // c1.modelo = "BIC";   // da erro pois modelo eh private

        //c1.setPonta(0.5f);
        // c1.ponta = 0.5f;     // da erro pois ponta eh private

        c1.status();

        System.out.println();

        Caneta c2 = new Caneta("Faber-Castell", "Vermelho", 0.7f);
        c2.status();

    }
}
