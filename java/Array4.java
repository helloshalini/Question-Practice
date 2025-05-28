public class Array4 {
    public static boolean Duplicate(int n[]) {
        
        for(int i = 1; i<n.length; i++) {
            for(int j = 1; j<n.length-i; j++) {

                int temp = n[j];
                n[j] = n[j+1];
                n[j+1] = temp;
            }
        }

        for(int i = 0; i<n.length-1; i++){
            if(n[i] == n[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n[] = {1, 2, 3, 1};
        System.out.println(Duplicate(n));
    }
}
