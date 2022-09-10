package com.gl.dataStructureAssignment.skyscraper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the total no of floors in the building: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num + 1];

        for (int i = 1; i <= num; i++) {
            System.out.println("Enter the floor size given on day : " + i);
            int n = sc.nextInt();
            arr[n] = i;
        }
        sc.close();

        FloorGenerator floorGenerator = new FloorGenerator();
        floorGenerator.calculateFloors(arr, num);
    }
}
