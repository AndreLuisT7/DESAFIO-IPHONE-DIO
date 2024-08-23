import java.util.List;
import java.util.Scanner;

public class ReprodutorMusical {
    Scanner sc = new Scanner(System.in);

    public String musica;
    public String[] listaMusica = new String[]{"ARERE", "PEQUENA EVA"};

    public String[] getListaMusica() {
        return listaMusica;
    }

    public void setListaMusica(String[] listaMusica) {
        this.listaMusica = listaMusica;
    }

    public ReprodutorMusical(String musica) {
        this.musica = musica;

    }
    public void tocar(){
        System.out.println("Tocando: " + musica);
    }
    public void pausar(){
        System.out.println("Musica pausada: ");
    }
    public void selecionarMusica(){
        System.out.println("escolha uma musica");
        System.out.println("1 - ARERE \n 2 - PEQUENA EVA\n");
        int escolha = sc.nextInt();
        if (escolha == 1){
            musica = listaMusica[0];
        } else if (escolha == 2) {
            musica = listaMusica[1];
        } else {
            System.out.println("Opção Invalida");
            return;
        }
        tocar();

    }

}
