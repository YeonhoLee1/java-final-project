public class Game {
    private String name;

    public Game(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void start() {
        System.out.println("Start " + name);
    }

    public void play() {
        System.out.println("Playing " + name);
    }

    public void end() {
        System.out.println("End " + name);
    }
}