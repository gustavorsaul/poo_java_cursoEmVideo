import java.util.Random;

public class Luta {


    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    // metodos publicos

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            System.out.println("\nLutadores de categorias diferentes");
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("---DESAFIADO---");
            this.desafiado.apresentar();
            System.out.println("---DESAFIANTE---");
            this.desafiante.apresentar();

            Random r = new Random();

            int probabilidadeDesafiado = r.nextInt(desafiado.getVitorias());
            int probabilidadeDesafiante = r.nextInt(desafiante.getVitorias());
            if (probabilidadeDesafiado > probabilidadeDesafiante) {
                System.out.println("Vitória do " + desafiado.getNome() + "!");
                desafiado.ganharLuta();
                desafiante.perderLuta();
            } else if (probabilidadeDesafiado < probabilidadeDesafiante) {
                System.out.println("Vitória do " + desafiante.getNome() + "!");
                desafiante.ganharLuta();
                desafiado.perderLuta();
            } else {
                System.out.println("Empate!");
                desafiado.empatarLuta();
                desafiante.empatarLuta();
            }
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }

    // getters e setters

    public Lutador getDesafiado() {
        return desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
