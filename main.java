public class main {

    public static void main(String[] args) {
        
    }

    public int[] createArray(int size){

    }
    public void printMenu(){

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
