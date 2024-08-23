public class Main {
    public static void main(String[] args) {


        ReprodutorMusical reprodutor = new ReprodutorMusical("");
        Telefone telefone = new Telefone();
        NavegadorInternet navegadorInternet = new NavegadorInternet();

        //METODOS DE REPRODUÇÃO MUSICAL
        reprodutor.selecionarMusica();
        reprodutor.pausar();

        //METODOS DE LIGAÇÃO
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioDeVoz();

        //METODOS DE NAVEGAÇÃO MA INTERNET
        navegadorInternet.exibirPagina("YouTube");
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();

    }
}