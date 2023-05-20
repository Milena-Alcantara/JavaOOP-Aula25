package Ex2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Funcionario funcionario1 = new Funcionario(1);
    Funcionario funcionario2 = new Funcionario(2);
    Funcionario funcionario3 = new Funcionario(3);

    funcionario1.setNome("Milena");
    LocalDate datadeAdmissao = LocalDate.of(2023,01,02); //A data de admissão vem aqui
    funcionario1.setDatedeAdm(datadeAdmissao);
    funcionario1.setSalario(1230.00);

        System.out.println(funcionario1.getIdent());
        System.out.println(funcionario2.getIdent());
        System.out.println(funcionario3.getIdent());


    funcionario2.setNome("Luana");
    LocalDate datadeAdmissao1 = LocalDate.of(2022,12,24);
    funcionario2.setDatedeAdm(datadeAdmissao1);
    funcionario2.setSalario(1500.00);

    funcionario3.setNome("Roberto");
    LocalDate datadeAdmissao2 = LocalDate.of(2020,06,21);
    funcionario3.setDatedeAdm(datadeAdmissao2);
    funcionario3.setSalario(2000);


    }
}
