package Java;

public class Toy implements Comparable<Toy> {
    private int id;
    private int weight;
    private String name;

    

    public Toy(int id, int weight, String name) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Toy other) {
        if (other == null) {
            return -1;
        }
        int delta = this.weight - other.weight;
        if (delta != 0) {
            return - delta;
        }  
        return this.name.compareTo(other.name);
    }
}
