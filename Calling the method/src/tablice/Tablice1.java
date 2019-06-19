package tablice;

public class Tablice1 {

    public static void main(String[] args) {

        Tablice1 main1 = new Tablice1();
        int[] numbers = {3, 8};
        System.out.println(main1.suma(numbers));
    }


    public int suma(int[] numberss) {
        return numberss[0] + numberss[1];
    }
}
