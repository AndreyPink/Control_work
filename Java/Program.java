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

            for (int i = 0; i < 10; i++) {
                PriorityQueue<Toy> randomQueue = new PriorityQueue<>(queue);
                for (int index = 0; index < queue.size(); index++) {
                    Toy randomToy = randomQueue.poll();
                    String text = String.format("id: %d, weight: %d, name: %s", randomToy.getId(),
                            randomToy.getWeight(),
                            randomToy.getName());
                    writer.write(text);
                    writer.append('\n');
                }
                writer.append('\n');
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
