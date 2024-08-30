package baitap298;

import java.util.Scanner;

public class Baitap298 {

    public static float[] importData(float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        arrays = new float[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arrays[i] = scanner.nextFloat();
        }
        return arrays;
    }

    public static void printData(float[] arrays) {
        System.out.print("Mang: ");
        for (float num : arrays) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static float findMax2(float[] arrays) {
        if (arrays.length < 2) {
            System.out.println("Mang phai co it nhat 2 phan tu.");
            return Float.NaN;
        }
        
        float max1 = Float.NEGATIVE_INFINITY;
        float max2 = Float.NEGATIVE_INFINITY;
        
        for (float num : arrays) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num < max1) {
                max2 = num;
            }
        }
        
        return max2;
    }

    public static float[] deleteOddNumber(float[] arrays) {
        int countEven = 0;
        
        for (float num : arrays) {
            if ((int) num % 2 == 0) {
                countEven++;
            }
        }
        
        float[] newArray = new float[countEven];
        int index = 0;
        
        for (float num : arrays) {
            if ((int) num % 2 == 0) {
                newArray[index++] = num;
            }
        }
        
        return newArray;
    }

    public static void main(String[] args) {
        float[] arrays = null;
        
        arrays = importData(arrays);
        
        printData(arrays);
        
        float max2 = findMax2(arrays);
        if (!Float.isNaN(max2)) {
            System.out.println("Phan tu lon thu 2 trong mang la: " + max2);
        }
        
        arrays = deleteOddNumber(arrays);
        System.out.println("Mang sau khi xoa cac phan tu le:");
        printData(arrays);
    }
}
