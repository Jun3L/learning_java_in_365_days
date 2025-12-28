public class day14 {
    public static void main(String[] args) {
        Person p = new Person("Junel", 19);

        /* hashcode error when not override toString()
        System.out.println(p);
         */

        //Override ToString()
        System.out.println(p);

        
    }
     static class Person {
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
    }
}
