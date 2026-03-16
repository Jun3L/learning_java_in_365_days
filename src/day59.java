public class day59 {
    public static void main(String[] args) {
     int n = 10;
        for(int i = 0; i < n; i++){
            System.out.print(fibonnaciCursive(i) + " ");
        }   
    }
    static int fibonnaciCursive(int n){
        if(n == 0) return 0;
        else if(n == 1) return 1;
        else return fibonnaciCursive(n-1) + fibonnaciCursive(n-2);
    }
}
