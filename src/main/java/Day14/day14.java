package Day14;
public class day14 {
    public static void main(String[] args) {
        
    }
     class Person {
      private String name;
     int age;
     
     // Parameterized constructor
     Person(String name, int age){
        this.name = name;
        this.age = age;
     }
        public String getName(){
            return name;
        }
        public void setName(String n){
            this.name = n;
        }
    }
}
