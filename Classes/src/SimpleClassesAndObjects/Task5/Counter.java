package SimpleClassesAndObjects.Task5;

public class Counter {
    private static int min = 0;
    private static int max = 9;
    private int value;

    private Counter() {
        this.value = (int) (min + (Math.random() * max));
        System.out.println("Counter was created with random value = " + this.value);
    }

    private Counter(int value) {
        this.value = value;
        System.out.println("Counter was created with value = " + this.value);
    }

    private static void increaseBy1(Counter counter) {
        if (counter.value < max) {
            counter.value++;
            System.out.println("Counter value was increased by 1 and now value = " + counter.value);
        } else {
            System.out.println("Counter cannot be increased because it's already MAX");
        }
    }

    private static void decreaseBy1(Counter counter) {
        if (counter.value > min) {
            counter.value--;
            System.out.println("Counter value was decreased by 1 and now value = " + counter.value);
        } else {
            System.out.println("Counter cannot be decreased because it's already MIN");
        }
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter(8);
        Counter counter2 = new Counter(1);

        //showing min max restrictions
        increaseBy1(counter1);
        increaseBy1(counter1);
        decreaseBy1(counter2);
        decreaseBy1(counter2);

        //showing counter with random value
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();
    }

    private int getValue() {
        return value;
    }
}
