public class Array5 {

    public static 


    public static int Search(int n[] , int item){
        int start = 0 , end = n.length-1;

        while(start > end) {
        
            int mid = (start+end)/2;
            if(n[mid] == item){
                return mid;
            }
            if(n[mid]<item){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        int n[] = {4, 5, 6, 7, 0, 1, 2};
        int item = 0;

        System.out.println("index is: "+ Search(n, item));
    }
}
