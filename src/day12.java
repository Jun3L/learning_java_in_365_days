public class day12 {
    public int add(int a, int b){
        return a + b;
    }
    public double add(double a, double b){
        return a + b;
    }
    public float add(float a, float b){
        return a + b;
    }
    public static void main(String[] args) {
        day12 day = new day12();
       int integer =  day.add(12, 45);
       double doub =  day.add(12.23, 42.12);
       float flo =  day.add(78.4f, 69.23f);

       System.out.println(integer);
       System.out.println(doub);
       System.out.println(flo);
    }
}
