package exercicio.pkg08.pkg03;

    import java.util.Scanner;

public class Exercicio0803 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Retangulo r1 = new Retangulo();
        System.out.println("Digite a altura: ");
        r1.setAltura(teclado.nextFloat());
        System.out.println("Digite a base: ");
        r1.setBase(teclado.nextFloat());
        System.out.printf("O perímetro do retângulo de base %.2f e altura %.2f é %.2f\n",r1.getBase(),r1.getAltura(),r1.peri(r1.getBase(),r1.getAltura()));
        System.out.printf("A área do retângulo de base %.2f e altura %.2f é %.2f",r1.getBase(),r1.getAltura(),r1.area(r1.getBase(),r1.getAltura()));
}
}