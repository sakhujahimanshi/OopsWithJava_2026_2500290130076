class Calculator {


    int add(int a, int b) {
        return a + b;
    }

    // Method 2
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        System.out.println(obj.add(2, 3));
        System.out.println(obj.add(2, 3, 4));
    }
}