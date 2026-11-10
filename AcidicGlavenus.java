public class AcidicGlavenus extends Glavenus {
    int corrosionAmount; //Current level of corrosion of the Acidic Glavenus

    public AcidicGlavenus(String name, int health, String tailSharpness, int corrosionAmount) {
        this.name = name;
        this.health = health;
        this.tailSharpness = tailSharpness;
        this.Enragement = false; //Default enragement is false
        this.corrosionAmount = corrosionAmount;
    }

    public void changeCorrosionAmount(int newCorrosionAmount) {
        corrosionAmount = newCorrosionAmount; //Changes the corrosion amount of the Acidic Glavenus
    }

    @Override
    public String toString() {
        String enragedStatus;
        if (Enragement) {
            enragedStatus = "enraged";
        } else {
            enragedStatus = "not enraged";
        }
        return name + " has " + health + " health, a tail that is " + tailSharpness + ", is " + enragedStatus + ", and has a corrosion amount of " + corrosionAmount; //Returns the information of the Acidic Glavenus
    }
}
