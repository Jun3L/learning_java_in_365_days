public class day59 {
    public static void main(String[] args) {
     int n = 10;
        for(int i = 0; i < n; i++){
            System.out.print(fibonnaciCursive(i) + " ");
        }   
    }
    static int fibonnaciCursive(int n){
        if(n == 0) return 0;
         if(n == 1) return 1;

         int a = 0, b = 1, c = 0;
         for(int i = 2; i <= n; i++){
                c = a + b;
                a = b;
                b = c;
         }
            return c;
    }
}
