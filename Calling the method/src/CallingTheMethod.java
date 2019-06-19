import test.*;

public class CallingTheMethod {

    public static void main(String[] args) {
        ifTemperatureIsPositive(23);

        test test1 = new test();
        test1.setAbc(53);
        System.out.println(test1.getAbc());
        test.method();
    }

    public static boolean temperature(int someTemperature) {
        return someTemperature > 0;
    }


    public static void ifTemperatureIsPositive(int someTemperature) {

        boolean comingTemperature = temperature(someTemperature);

        if (comingTemperature)
            System.out.println("Temperature is positive");
        else
            System.out.println("Temperature is negative or zero");
    }
}
