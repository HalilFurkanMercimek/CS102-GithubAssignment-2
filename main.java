public class main {

    public static void main(String[] args) {
        
    }

    public int[] createArray(int size){

    }
    public void printMenu(){
            
    }
    public void findMax(int[] arr){

    }
     public void findMin(int[] arr){

    }
    public void partD(){

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
