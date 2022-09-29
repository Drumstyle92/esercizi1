package nuovo.inizio.develhope;

public class Tester {
    public static void main(String[] args){
    Programmer p1 = new Programmer();
    p1.name = " Dino ";
    p1.age = 30;
    p1.wearsGlasses = true;
    Programmer p2 = new Programmer();
    p2.name = " Giovanni ";
    p2.age = 40;
    p2.wearsGlasses = false;
        p1.printDetails();
        p1.drinkCoffe();
        p2.printDetails();
        p2.hasGlasses();
}}
