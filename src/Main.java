import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1 () {
        System.out.println("Задача № 1");
        int mass1[] = new int [3];
        mass1[0] = 1;
        mass1[1] = 2;
        mass1[2] = 3;
        float mass2[] = {1.57f, 7.654f, 9.986f};
        byte mass3[] = {1, 5, 8};
        System.out.println();
    }
    public static void task2 () {
        int mass1[] = new int [3];
        mass1[0] = 1;
        mass1[1] = 2;
        mass1[2] = 3;
        float mass2[] = {1.57f, 7.654f, 9.986f};
        byte mass3[] = {1, 5, 8};
        System.out.println(mass1[0] + " , " + mass1[1] + " , " + mass1[2]);
        System.out.println(mass2[0] + " , " + mass2[1] + " , " + mass2[2]);
        System.out.println(mass3[0] + " , " + mass3[1] + " , " + mass3[2]);
    }
    public static void task3 () {
        int mass1[] = new int [3];
        mass1[0] = 1;
        mass1[1] = 2;
        mass1[2] = 3;
        float mass2[] = {1.57f, 7.654f, 9.986f};
        byte mass3[] = {1, 5, 8};
        System.out.println(mass1[2] + " , " + mass1[1] + " , " + mass1[0]);
        System.out.println(mass2[2] + " , " + mass2[1] + " , " + mass2[0]);
        System.out.println(mass3[2] + " , " + mass3[1] + " , " + mass3[0]);
    }
    public static void task4 () {
        int mass1[] = new int [3];
        mass1[0] = 1;
        mass1[1] = 2;
        mass1[2] = 3;
        for (int i = 0; i < mass1.length; i++) {
            if(mass1[i]%2 != 0) {
                mass1[i] = mass1[i] +1;
            }
        }
        System.out.println(Arrays.toString(mass1));
    }
}