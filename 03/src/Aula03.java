public class Aula03 {


    public static void main(String[] args) throws Exception {
        
        // modificadores de visibilidade

        // + publico        ex: telefone publico
        // classe atual e todas as outras tem acesso 

        // - privado        ex: telefone pessoal
        // somente a classe atual

        // # protegido      ex: telefone residencial
        // a clase atual e todas suas sub-classes

            //Caneta c1 = new Caneta();
        
            //c1.modelo = "BIC";
            //c1.cor = "Azul";
        // c1.ponta = 0.5; erro pois ponta eh private

            //c1.carga = 80;

        
            //c1.destampar();

        /*  
            variavel tampada em Caneta eh private, mas o metodo destampar eh public, portando por estar dentro
            da classe Caneta, o metodo usa a variavel dentro dela a partir do metodo e deixa usar de forma privada      
        */
        
            //c1.rabiscar();
            //c1.status();




    }
}
