
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(shouldWakeUp(false, 26));
        System.out.println(hasTeen(85, 25,29));
        System.out.println(isCatPlaying(false, 42));
        System.out.println(area(95,456.545));
        System.out.println(area(5.6));
    }

    public static boolean shouldWakeUp(boolean isBarking, int time) {
        if ( (time>0 && time < 8) || (time > 20 && time <24)) {
            return true;
        } else if (time < 0) {
            return false;
        }

        return false;
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        int[] nums = {num1, num2, num3};

        for (int num : nums) {
            if (num >= 13 && num <= 19) {
                return true;
            }
        }

        return false;
    }

    public static boolean isCatPlaying(boolean summer, int degree) {
        if(summer && (degree>25 && degree<45))
        {
            return true;
        }
        else if(!summer &&(degree>25 && degree<35)) {
            return true;
        }

        return false;
    }
public static double area(double num1, double num2) {
        if (num1<0 || num2<0) {
            return -1;
        } else {
            return num1*num2;
        }
}
    public static double area(double num1) {
        if (num1<0) {
            return -1;
        } else {
            return num1*num1*Math.PI;
        }
    }


}