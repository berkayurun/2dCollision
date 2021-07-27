public class Collision {
    private Item firstItem;
    private Item secItem;

    public Collision(Item firstItem, Item secItem) {
        this.firstItem = firstItem;
        this.secItem = secItem;
    }

    public void collideX(){
        double mass1 = firstItem.getMass();
        double mass2 = secItem.getMass();
        double vel1 = firstItem.getVelocity().getX();
        double vel2 = secItem.getVelocity().getX();

        firstItem.getVelocity().setX(newXV1(mass1, mass2, vel1, vel2));
        secItem.getVelocity().setX(newXV2(mass1, mass2, vel1, vel2));
    }

    private static double newXV1(double mass1, double mass2, double vel1, double vel2){
        return ((mass1-mass2) / (mass1 + mass2)) * vel1 + ((2*mass2)/(mass1 + mass2)*vel2);
    }

    private static double newXV2(double mass1, double mass2, double vel1, double vel2){
        return( ((2 * mass1 )/ (mass1 + mass2)) * vel1) + (((mass2 - mass1) / (mass1 + mass2))*vel2);
    }
}
