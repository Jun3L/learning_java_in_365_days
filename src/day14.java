public class day14 {
    public static void main(String[] args) {
        Person p = new Person("", 0);
        Person p1 = new Student("", 0);

        /* hashcode error when not override toString()
        System.out.println(p);
         */

        //Override ToString()
        //System.out.println(p);

        //call introduce() method
        p1.introduce();
        p.introduce();
        
    }
    
            
    }
   
    

