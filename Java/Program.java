package Java;

import java.util.PriorityQueue;

public class Program {

    public static void main(String[] args) {
        Toy toy1 = new Toy(1, 2, "конструктор");
        Toy toy2 = new Toy(2, 2, "робот");
        Toy toy3 = new Toy(3, 6, "кукла");

        PriorityQueue<Toy> queue = new PriorityQueue<>();

        queue.add(toy1);
        queue.add(toy2);
        queue.add(toy3);

        for (int index = 0; index < 10; index++) {
            System.out.printf("id: %d, weight: %d, name: %s", queue.peek().getId(), queue.peek().getWeight(),
                    queue.peek().getName());
            System.out.println();
        }
    }
}
