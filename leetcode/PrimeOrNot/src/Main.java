public class Main {

    public static void main(String[] args) {
        if (Prime.isPrime(3)){
            System.out.println("is prime");
        }else {
            System.out.println("not prime");
        }

        System.out.println(Factors.factors(20));
        System.out.println(Factors.factorsUsingStream(20));
    }
}
