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
    public void partD(){

    }
    public void partE(){
        
    }
}
