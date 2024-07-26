public class CounterMain {
    public static void main(String[] args) {
        Counter counter1 = new Counter(10);
        System.out.println(counter1.value());

        Counter counter2 = new Counter();
        System.out.println(counter2.value());

        counter1.increase();
        System.out.println(counter1.value());

        counter1.decrease();
        System.out.println(counter1.value());

        counter1.increase(5);
        System.out.println(counter1.value());

        counter1.decrease(3);
        System.out.println(counter1.value());

        counter2.increase(-5);
        System.out.println(counter2.value());

        counter2.decrease(-3);
        System.out.println(counter2.value());

        counter2.increase(7);
        System.out.println(counter2.value());

        counter2.decrease(2);
        System.out.println(counter2.value());
    }
}

