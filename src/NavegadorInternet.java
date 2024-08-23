import java.util.Scanner;

public class NavegadorInternet {
    public String url;

    public void exibirPagina(String url){
        System.out.println("Pagina aberta: " + url);
    }
    public void adicionarNovaAba(){
        System.out.println("Nova aba aberta");
    }
    public void atualizarPagina(){
        System.out.println("Pagina atualizada");
    }
}
