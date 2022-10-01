package Java4Noobs;

public class TestandoFuncoes {
    public static int soma(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void mostrar(int x) {
        System.out.println(x);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        int c = soma(a, b);

        mostrar(c);
    }
}
