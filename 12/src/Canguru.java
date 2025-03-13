public class Canguru extends Mamifero {

    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }

    @Override
    public void locomover() {
        System.out.println("Saltando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo folhas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de canguru");
    }

}
