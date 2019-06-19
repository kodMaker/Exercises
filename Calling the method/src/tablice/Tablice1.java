package tablice;

public class Tablice1 {

    public static void main(String[] args) {

        Tablice1 main1 = new Tablice1();
        int[] numbers1 = {3, 8};
        System.out.println(main1.suma(numbers1));

        int[] numbers2 = {200, 320, 23};
        System.out.println(theBiggestNumber(numbers2));
        System.out.println(theBiggestNumberWithoutIf(numbers2));
    }


    public int suma(int[] numberss) {
        return numberss[0] + numberss[1];
    }

    public static int theBiggestNumber(int[] numbers2) {
        int biggest = numbers2[0];

        if(numbers2[1] > biggest)
            biggest = numbers2[1];

        if (numbers2[2] > biggest)
            biggest = numbers2[2];

        return biggest;
    }

    public static int theBiggestNumberWithoutIf (int[] numbers2) {
        return Math.max(numbers2[0], Math.max(numbers2[1], numbers2[2]));
    }
}
