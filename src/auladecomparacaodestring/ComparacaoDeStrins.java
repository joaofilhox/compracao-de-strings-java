package auladecomparacaodestring;

public class ComparacaoDeStrins {

    public static void main(String[] args) {
        
        String nome, senha, tipo;

        nome = "Flavio";
        senha = "123";
        tipo = "adm";

        String nomeComparacao = "Flavio";
        String senhaComparacao = "123";
        String tipoComparacao = "adm";

        if ((nome.equals(nomeComparacao)) && (senha.equals(senhaComparacao))) {
            if (tipo.equals(tipoComparacao)) {
                System.out.println("Entrou com adm");
            } else {
                System.out.println("Entrou com usuario comum");
            }
        } else {
            System.out.println("Dados invalidos");
        }
    }
}

