package Ex1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Azul blue = new Azul(1);
        System.out.println("Tom inicial do Azul: "+blue.getTonalidade());

        blue.tornarMaisEscuro();
        System.out.println("Azul um pouco mais escuro, agora a tonalidade é: "+blue.getTonalidade());

        System.out.println("Escolha uma opção:");
        System.out.println("1- Escurecer mais um pouco \t 2- Calcular nova tonalidade:");
        switch (input.nextInt()){
            case 1:
                System.out.println("Informe quando deseja aumentar: ");
                blue.TornarTonalidadeMaisEscura(input.nextInt());
                System.out.println("Tonalidade atual = "+blue.getTonalidade());
                break;

            case 2:
                System.out.println("Informe o tom que deseja ");
                blue.calcularTonalidade(input.nextInt());
                break;

            default:
                System.out.println("Por favor, escolha entre opção 1 e 2");
                System.exit(0);

        }
    }
}