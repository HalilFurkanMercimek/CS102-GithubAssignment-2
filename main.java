import java.util.Random;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
    }

    public int[] createArray(int size){
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i<arr.length; i++){
            arr[i] = rand.nextInt(0,101);
        }
        return arr;
    }
    public void printMenu(){
        Scanner input = new Scanner(System.in);
        boolean isExit = false;

        while (isExit) {
            System.out.println("Type size of the array:");
            int size = input.nextInt();
            System.out.println("1- Find Max Value\n2- Find Min Value\n3- Find Difference\n4- Find Sum");
            System.out.print("Choose what you want: ");
            int choise = input.nextInt();

            int [] array = createArray(size);

            if (choise == 1) {
                findMax(array);
            }
            else if (choise == 2) {
                findMin(array);
            }
            else if (choise == 3) {
                differenceBetweenAverage(array);
            }
            else if (choise == 4) {
                findSumOfElements(array);
            }
        }

    }
    public void findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++ ){
            if( arr[i] > max) max = arr[i];
        }
        System.out.println("max number is " + max);
    }
    public void findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length; i++ ){
            if( arr[i] > min) min = arr[i];
        }
        System.out.println("min number is " + min);

    }
    public void differenceBetweenAverage(int[] arr){
        int sum = 0;
        int ave = 0;
        String arrayString = "";
        for(int i = 0; i < arr.length; i++){
            sum += arr[i]; 
        }

        ave = sum/arr.length; 

        int[] differenceArray = new int[arr.length];

        for(int j = 0; j < arr.length; j++){
            differenceArray[j] = ave - arr[j];
        }

        arrayString += "(";
        for (int k = 0; k < arr.length; k++){

            arrayString += differenceArray[k];
            if (k != arr.length-1) {
                arrayString += ",";
            }

        }
        arrayString += ")";

        System.out.println(arrayString);
        
    }
    public void findSumOfElements(int[] arr){
        int length = arr.length;
        int sumOfOdd = 0, sumOfEven = 0;
        
        for(int i = 0; i < length; i++){
            if(i % 2 == 0){
                sumOfEven += arr[i];
            }
            else{
                sumOfOdd += arr[i];
            }
        }

        System.out.println("Sum of odd indexes is " + sumOfOdd);
        System.out.println("Sum of even indexes is " + sumOfEven);
    }
}
