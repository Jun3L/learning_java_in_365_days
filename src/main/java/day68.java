public class day68 {
    static class Box<T> {
        private T value;

        public Box(T value) {
            this.value = value;
        }
        void setValue(T value) {
            this.value = value;
        }
        T getValue() {
            return value;
        }

    }

    public static void main(String[] args) {
        System.out.println("Generic Class Example");
        Box<String> stringBox = new Box<>("Hello, Generic World!");
        System.out.println("Value in stringBox: " + stringBox.getValue());
        stringBox.setValue("Hello world!");
        System.out.println("Updated value in stringBox: " + stringBox.getValue());

    }
}
