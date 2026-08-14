public class day13 {
    static void add(int... a){
		int sum = 0;
		
		for(int num : a){
			sum += num;
			}
			System.out.println(sum);
		}
    public static void main(String[] args) {
        add(23,15,45,78);
    }
}
