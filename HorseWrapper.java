public class HorseWrapper {

    public static void main(String[] args){
        Horse horse1 = new Horse("HorseTheThird", 2010);
        System.out.println(horse1);
        horse1.changeName("Horcus");
        System.out.println(horse1);
        Horse horse2 = new Horse("Crystal", 2001);
        System.out.println(horse2);
        horse2.changeName("Horsila");
        System.out.println(horse2);
        Horse horse3 = new Horse("Jeff", 1200);
        System.out.println(horse3);
        horse3.changeName("JeffVonHorseTheFourteenth");
        System.out.println(horse3);
    }

}