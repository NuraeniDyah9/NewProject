import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author premium
 */
public class TugasArray {
    
// Untuk no 2 arr2[] akan menampung nilai 0 
    
    
    static int[] arr1 = {25, 14, 56, 15, 36, 56, 36, 36, 29, 49};
    static int[] arr2 = new int[10];
    static int[] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
    static int[] arr4 = new int[10];

    static void averageArray() {

        float tamp = 0, avg;
        float len = arr1.length;
        for (int i = 0; i < len; i++) {
            tamp += arr1[i];

        }
        avg = tamp / len;
        System.out.println("The average of the arr1ays is " + avg);

    }

    static void checkIndex() {
        int tamp[] = new int[10];
        int input, x = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the data that you want know the position/index: ");
        input = scan.nextInt();
        for (int i = 0; i < arr1.length; i++) {
            if (input == arr1[i]) {
                tamp[x] = i;
                x++;
            }

        }
        for (int i = 0; i < x; i++) {
            System.out.println(input + " in index " + tamp[i]);

        }
    }

    static void changeArray(int value, int index) {
        System.out.println("Before: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Index " + i + ":" + arr1[i]);

        }
        arr1[index] = value;
        System.out.println("After: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Index " + i + ":" + arr1[i]);

        }
    }

    static void deleteValue(int value) {
        for (int i = 0; i < arr1.length; i++) {
            if (value == i) {
                System.out.println("The data has been deleted");
                arr1[i] = arr1[i + 1];
            }
            if (i == arr1.length - 1) {
                continue;
            } else {
                System.out.println("The data " + i + " : " + arr1[i]);
            }

        }
    }

    static void insertIntoTheMiddle(int index, int value) {
        int x = arr1.length + 1;
        int c = 0;
        int arr1_tam[] = new int[x];
        if (index < arr1.length) {
            System.out.println("The new array : ");
            for (int i = 0; i < arr1_tam.length; i++) {
                if (i == index) {
                    arr1_tam[i] = value;
                } else {
                    arr1_tam[i] = arr1[c];
                    c++;
                }
                System.out.println(i + ":" + arr1_tam[i]);
            }
        }
    }

    static void copyArray() {
        int arr12[] = new int[arr1.length];
        for (int i = 0; i < arr12.length; i++) {
            arr12[i] = arr1[i];
            System.out.println("The arr1 " + arr1[i] + "| The arr12 " + arr12[i]);
        }

    }

    static void MinArray() {
        int min = arr1[0];

        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] < min) {
                min = arr1[i];
            }

        }
        System.out.println("The min value: " + min);
    }

    static void maxArray() {
        int max = arr1[0];

        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] > max) {
                max = arr1[i];
            }

        }
        System.out.println("The max value: " + max);
    }

    ///////////////////////////// Not Yet
    static void DuplicateNumber() {
        int arr1duplicate[] = new int[arr1.length];
        int x = 0, y = 0;
        int status = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i] == arr1[j] && i == j) {
                    continue;
                } else if (arr1[i] == arr1[j]) {
                    x++;
                }
            }
            arr1duplicate[y] = x;
            y++;
        }
        for (int i = 0; i < y; i++) {
            System.out.println("The duplicate number : " + arr1duplicate[i]);

        }
    }
///////////////////////////// Not Yet
    static void TheSameNumberinArr1AndArr3() {
        int z = 0;
        int arrnew[] = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                if (arr1[i] == arr3[j]) {
                    arrnew[z] = arr1[i];
                    z++;
                }

            }

        }
        for (int i = 0; i < arrnew.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arrnew[i] == arrnew[j]) {
                    System.out.println("The same number in arr1 and arr3 : " + arrnew[i]);
                }
            }

        }
    }

    public static void main(String[] args) {
        int input, index;
       
        averageArray();
        //checkIndex();
        Scanner scan = new Scanner(System.in);

         System.out.println("Input you data: ");
         input = scan.nextInt();
         System.out.println("Input the position/index: ");
         index = scan.nextInt();
         //changeArray(input,index);
         insertIntoTheMiddle(index,input);
         System.out.println("Input the position/index want to delete: ");
         index = scan.nextInt();
         deleteValue( index);
         copyArray();
         MinArray();
         maxArray();
         DuplicateNumber();
         TheSameNumberinArr1AndArr3();
    }

}
