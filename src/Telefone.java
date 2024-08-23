import java.util.Scanner;

public class Telefone {
    public String numero;
    public String[] contatos = new String[]{"MÃE", "PAI"};

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void ligar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Para quem deseja ligar");
        System.out.println("1 - MÃE | 2 PAI");
        int esc = sc.nextInt();
        if (esc == 1){
            numero = contatos[0];
        } else if (esc == 2) {
            numero = contatos[1];
        }else {
            System.out.println("Opção Invalida");
            return;
        }
        System.out.println("Ligando para " + numero);
    }

    public void atender(){
        Scanner sc = new Scanner(System.in);
        System.out.println("MÃE ESTÁ LIGANDO");
        System.out.println("1 - ATENDER || 2 - DESLIGAR\n");
        int esc = sc.nextInt();
        if(esc == 1){
            System.out.println("Ligação está ativa");
        } else if (esc == 2) {
            System.out.println("Ligação não atendida");
        }else {
            System.out.println("Opção Invalida");
            return;
        }

    }
    public void iniciarCorreioDeVoz(){
        System.out.println("Correio de voz iniciado!");
    }
}
