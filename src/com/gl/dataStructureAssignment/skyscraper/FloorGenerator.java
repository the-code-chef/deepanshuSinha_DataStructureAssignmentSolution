package com.gl.dataStructureAssignment.skyscraper;

public class FloorGenerator {

    void calculateFloors(int[] arr, int num) {
        int j = num;
        boolean flag;

        System.out.println("The order of construction is as follows");
        for (int i = 1; i <= num; i++) {
            flag = false;
            System.out.println("Day: " + i);
            while (j >= 1 && arr[j] <= i) {
                flag = true;
                System.out.print(j + " ");
                j--;
            }
            if (flag) {
                System.out.println();
            }
        }
    }
}
