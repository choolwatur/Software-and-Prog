public class GlavenusWrapper {
    public static void main(String[] args) {
        Glavenus monster1 = new Glavenus();
        Glavenus monster2 = new Glavenus();
        Glavenus monster3 = new Glavenus();
        monster1.changeName("Glavenus");
        monster2.changeName("Acidic Glavenus");
        monster3.changeName("Honed Glavenus");

        monster1.changehealth(19200);
        monster1.changeTailSharpness("sharp");
        monster1.changeEnragement(false);

        monster2.changehealth(19900);
        monster2.changeTailSharpness("rough");
        monster2.changeEnragement(true);


        monster3.changehealth(12000);
        monster3.changeTailSharpness("sharp");
        monster3.changeEnragement(true);

        System.out.println("Monster 1: " + monster1.toString());
        System.out.println("Monster 2: " + monster2.toString());
        System.out.println("Monster 3: " + monster3.toString());
}
    }