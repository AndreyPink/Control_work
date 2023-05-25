package Java;

import java.io.FileWriter;
import java.io.IOException;
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


        try (FileWriter writer = new FileWriter("Java/randomToy.txt")) {
            for (int index = 0; index < 10; index++) {
                PriorityQueue<Toy> randomQueue = queue;
                String text = String.format("id: %d, weight: %d, name: %s", randomQueue.peek().getId(),
                randomQueue.peek().getWeight(),
                randomQueue.peek().getName());
                writer.write(text);
                writer.append('\n');
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
