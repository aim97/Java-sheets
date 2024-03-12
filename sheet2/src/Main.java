import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Color {
    private final int red, green, blue;
    Color(int r, int g, int b) {
        red = r;
        green = g;
        blue = b;
    }

    void print() {
        System.out.println("(" + red + ", " + green + ", " + blue + ")");
    }

    @Override
    public String toString() {
        return "(" + red + ", " + green + ", " + blue + ")";
    }
}

class Randomizer {
    int random100() {
        return new Random().nextInt(100) + 1;
    }

    int randomInRange(int l, int h) {
        return new Random().nextInt(h - l + 1) + l;
    }

    Color randomColor () {
        int r = this.randomInRange(0, 255);
        int g = this.randomInRange(0, 255);
        int b = this.randomInRange(0, 255);
        return new Color(r, g, b);
    }
}

public class Main {
    public static void temperatureAverage() {
        Scanner sc = new Scanner(System.in);
        int days = 3;
        int readings = 4;
        float [][] temperatures = new float[days][readings];

        // take user input
        for (int i = 0;i < days; i++) {
            float sum = 0;
            for (int j = 0; j < readings; j++) {
                temperatures[i][j] = sc.nextFloat();
                sum += temperatures[i][j];
            }
            System.out.printf("Average of temperature on day %d is %f\n", i+1, sum / readings);
        }
    }

    public static void matProduct() {
        int[][] mat1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] mat2 = {{1,2,3},{4,5,6},{7,8,9}};

        int[][] mat3 = new int[mat1.length][mat2[0].length];

        for (int row = 0; row < mat3.length; row++) {
            for (int col = 0; col < mat3[row].length; col++) {
                for (int step = 0; step < mat1.length; step++) {
                    mat3[row][col] += mat1[row][step] * mat2[step][col];
                }
            }
        }

        for (int[] ints : mat3) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static void kLargest() {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();

        if (k > n) {
            System.out.println("Out of range");
        } else {
            int [] arr = new int[n];
            for (int i = 0; i < n;i ++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            System.out.printf("The %dth largest element is %d\n", k, arr[n - k]);
        }
    }

    public static void freq() {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0;i < n;i ++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int lastDifferentElement = 0, idx = 1, count = 1;
        while (idx < arr.length) {
            if (arr[lastDifferentElement] == arr[idx]) {
                count += 1;
            } else {
                System.out.println(arr[lastDifferentElement]+ " " + count);
                lastDifferentElement = idx;
                count = 1;
            }
            idx += 1;
        }
        System.out.println(arr[lastDifferentElement]+ " " + count);
    }

    public static void testRandom() {
        Randomizer r = new Randomizer();
        System.out.println("Random from 1 to 100: " + r.random100());
        System.out.println("Random from 25 to 1000: " + r.randomInRange(25, 1000));
        Color c = r.randomColor();
        c.print();
        // System.out.println(c); // this will automatically call the toString function and will be later discussed with overriding
    }

    public static void main(String[] args) {
        // Uncomment the following code to make it work

        // Section 2
        // Main.temperatureAverage();
        // Main.kLargest();
        // Main.matProduct();
        // Main.freq();

        // Section 3
        // Main.testRandom();
    }
}