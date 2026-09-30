
public class User {
    private int noTurns;
    private String name;

    // Constructor used by: new User(5, "Colby")
    public User(int noTurns, String name) {
        this.noTurns = noTurns;
        this.name = name;
    }

    // Getter used by: user.getNoTurns()
    public int getNoTurns() {
        return noTurns;
    }

    public String getName() {
        return name;
    }

    // Overriding toString makes printing the array elements simple
    @Override
    public String toString() {
        return name + " (" + noTurns + " turns)";
    }
}

