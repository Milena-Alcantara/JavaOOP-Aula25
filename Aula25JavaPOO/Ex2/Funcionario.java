package Ex2;

import java.time.LocalDate;
import java.util.Date;

public class Funcionario {
    private String nome;
    private LocalDate datedeAdm;
    private double salario;
    static int identificador;
    private int ident;

    public Funcionario(int identificador){
      this.ident = identificador;
    }
    public int getIdent(){
        return ident;
    }
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    public void setDatedeAdm(LocalDate datedeAdm){
        this.datedeAdm = datedeAdm;
        LocalDate dataAtual = LocalDate.now();
        if(datedeAdm.isAfter(dataAtual)){
            System.out.println("Data futura não permitida");
            System.exit(0);
        }
    }
        public LocalDate getDatedeAdm(){
        return datedeAdm;
    }

    public double getSalario(){
        return salario;
    }
    public void setSalario( double sal){
        if(sal<700){
            System.out.println("Valor de salário não permitido");
            System.exit(0);
    }
        this.salario =  sal;
    }


    public void setIdentificador(int id){
        identificador = id;
    }
}
