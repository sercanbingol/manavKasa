import java.util.Scanner;

 class ManavKasa {
    public static void main(String[] args) {
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.0,tutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut kac kilo : ");
        armut *= input.nextInt();
        System.out.print("Elma kac kilo : ");
        elma *= input.nextInt();
        System.out.print("Domates kac kilo : ");
        domates *= input.nextInt();
        System.out.print("Muz kac kilo : ");
        muz *= input.nextInt();
        System.out.print("Patlican kac kilo : ");
        patlican *= input.nextInt();

        tutar = armut+elma+domates+muz+patlican;
        System.out.println("Toplam tutar : " + tutar);

    }
}