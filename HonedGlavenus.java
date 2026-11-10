public class HonedGlavenus extends Glavenus {
    int armorDurability; //Current level of armor durability of the Honed Glavenus

    public HonedGlavenus(String name, int health, String tailSharpness, int armorDurability) {
        this.name = name;
        this.health = health;
        this.tailSharpness = tailSharpness;
        this.Enragement = false; //Default enragement is false
        this.armorDurability = armorDurability;
    }

    public void changeArmorDurability(int newArmorDurability) {
        armorDurability = newArmorDurability; //Changes the armor durability of the Honed Glavenus
    }

    @Override
    public String toString() {
        String enragedStatus;
        if (Enragement) {
            enragedStatus = "enraged";
        } else {
            enragedStatus = "not enraged";
        }
        return name + " has " + health + " health, a tail that is " + tailSharpness + ", is " + enragedStatus + ", and has an armor durability of " + armorDurability; //Returns the information of the Honed Glavenus
    }

}
