package Ex1;

public class Azul {

    public static String cor = "Azul";
    private int tonalidade;   // criado atributo tonalidade para poder implementer método set
    public Azul(int tonalidade) {
        this.tonalidade = tonalidade; //ex 1 - questão f
    }

    public void setTonalidade(int tonalidade) {  //resposta ex 1 - questão D
        this.tonalidade = tonalidade;
    }
    public int getTonalidade() {
        return tonalidade;}
    public void tornarMaisEscuro() {
        tonalidade++;
    }

    void calcularTonalidade(int tom) {
       switch (tom){
           case 1:
           case 2:
           case 3:
               System.out.println("O tom de azul é claro,  tonalidade = "+(tonalidade = tom));
               break;

           case 4:
           case 5:
           case 6:
               System.out.println("O tom de azul é médio, tonalidade  = "+(tonalidade = tom));
               break;

           case 7:
           case 8:
           case 9:
               System.out.println("O tom de azul é escuro, tonalidade = "+(tonalidade = tom));
               break;

           default:
               System.out.println("A régua  de tonalidade para esta cor é 1 a 9.");
               System.exit(0);
       }
    }
    public void TornarTonalidadeMaisEscura(int valor) {
        tonalidade += valor;
    }
}
