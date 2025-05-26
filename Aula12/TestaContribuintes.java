package Aula12;

public class TestaContribuintes {
    public static void main(String[] args) {
        Contribuintes contribuintes = new Contribuintes();

        PessoaFisica pf1 = new PessoaFisica("Ale", 2000);
        Contribuinte pj1 = new PessoaJuridica("XYZ", 15000);

        contribuintes.adicionaContribuinte(pf1);
        contribuintes.adicionaContribuinte(pj1);
        contribuintes.adicionaContribuinte(new PessoaFisica("Mignon", 5000));
        contribuintes.adicionaContribuinte(new PessoaJuridica("ABC", 20000));

        contribuintes.apresentaContribuintes();
    }
}
