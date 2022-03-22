public class CalculoMedia {
    public static void main(String[] args) {

        int num1 = 150;
        int num2 = 200;
        int num3 = 100;
        int num4 = 150;
        int aprovado = (num1  + num2 + num3 + num4)/4;

        boolean media = aprovado > 70;
        System.out.println("Aprovado " + media);

    }
}
