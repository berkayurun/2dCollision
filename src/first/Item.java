package first;

public class Item {
    private double mass;
    private Velocity velocity = new Velocity(0,0);
    private int energy;
    private Location location = new Location(0,0);
    private double sizeX;
    private double sizeY;

    public Item(double mass, Velocity velocity, int energy, Location location, double sizeX, double sizeY) {
        this.mass = mass;
        this.velocity = velocity;
        this.energy = energy;
        this.location = location;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public Velocity getVelocity() {
        return velocity;
    }

    public void setVelocity(Velocity velocity) {
        this.velocity = velocity;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}
