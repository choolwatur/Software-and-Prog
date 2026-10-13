public class Glavenus {
    int health; //Current health of the Glavenus
    String tailSharpness; //If the tail is sharp or rough
    boolean Enragement; //Whether the Glavenus is enraged or not

    public void changehealth(int newHealth) {
        health = newHealth; //Changes the health of the Glavenus
    }

    public void changeTailSharpness(String newTailSharpness) {
        tailSharpness = newTailSharpness; //Change the tail sharpness of the Glavenus
    }

    public void changeEnragement(boolean enraged) {
        Enragement = enraged; //Changes the enragement of the Glavenus
    }
    public String toString() {
        return "Glavenus has " + health + " health, a tail that is " + tailSharpness + ", and is " + Enragement; //Returns the information of the Glavenus
    }
}
