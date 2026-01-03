package Day14;
public class Person {
     private String name;
     private int age;
     
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
        public int getAge(){
          return age;
        }
        public void setAge(int a){
            this.age = a;
        }
            @Override
            public String toString(){
                return "Your name  is " + this.name + " and your age is " + this.age;
            }
            void introduce(){
              System.out.println("I'm a Person");
            }
}
