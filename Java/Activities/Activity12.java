package activities;

interface Addable {
    int add(int a, int b);
}

public class Activity12 {
    public static void main(String[] args) {

     
        // Lambda expression with return keyword.
        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad2.add(10, 10));
    }
}