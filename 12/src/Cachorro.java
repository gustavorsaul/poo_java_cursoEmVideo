public class Cachorro extends Mamifero{

    public void enterrarOsso(){
        System.out.println("Enterrando osso");
    }

    public void abanarRabo(){
        System.out.println("Abanando o rabo");
    }

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo ração");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au au");
    }

}
