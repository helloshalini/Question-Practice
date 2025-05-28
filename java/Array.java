public class Array {
    public static int getLargest (int number[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i<number.length; i++){
            if(largest < number[i]) {
                largest = number[i];
            }
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        System.out.println("smallest value is : "+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int number[] = {1,4,5,2,8,9};
        System.out.println("largest value is : " + getLargest(number));
    }
}
