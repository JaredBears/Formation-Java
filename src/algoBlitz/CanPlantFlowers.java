package algoBlitz;

import java.util.Arrays;
import java.util.LinkedList;

public class CanPlantFlowers {

  public static void main(String[] args) {
    LinkedList<Integer> flowerBed = new LinkedList<Integer>(Arrays.asList(1,0,0,0,1));
    LinkedList<Integer> flowerBedTwo = new LinkedList<Integer>(Arrays.asList(0,0,1));
    LinkedList<Integer> flowerBedThree = new LinkedList<Integer>(Arrays.asList(1,0,0));
    LinkedList<Integer> flowerBedFour = new LinkedList<Integer>(Arrays.asList(0,1,1));
    
    System.out.println(canPlantFlowers(flowerBed, 1));
    System.out.println(canPlantFlowers(flowerBed, 2));
    System.out.println(canPlantFlowers(flowerBedTwo, 1));
    System.out.println(canPlantFlowers(flowerBedTwo, 2));
    System.out.println(canPlantFlowers(flowerBedThree, 1));
    System.out.println(canPlantFlowers(flowerBedThree, 2));
    System.out.println(canPlantFlowers(flowerBedFour, 1));
    System.out.println(canPlantFlowers(flowerBedFour, 2));

  }

  static boolean canPlantFlowers(LinkedList<Integer> arr, int n) {
    arr.addFirst(0);
    arr.addLast(0);
    int count = 0;
    
    for(int i = 1; i < arr.size()-1; i++) {
      if(arr.get(i) == 0 && arr.get(i-1) == 0 && arr.get(i+1) == 0) {
        count++;
        arr.set(i, 1);
        if(count >= n) {
          return true;
        }
      }
    }

    return false;
  }

}
