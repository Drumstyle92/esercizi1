package nuovo.inizio.develhope;

public class Programmer {
    String name = "Dino";
    int age = 30;
    boolean wearsGlasses = false;

    public static class TestProgrammes {
        String name;
        int age;
        boolean wearsGlasses;
    }

    static void drinkCoffe(){
        System.out.println("Espresso is the secret!");
    }

     public void printDetails(String name1,int age2) {


    System.out.println(name1 + " is a Age " + age2);
    }

    void hasGlasses(String name1, boolean wearsGlasses2) {

        System.out.println("is " + name1 + " wearing Glasses? " + wearsGlasses2);
    }

 public static void main(String[] arg) {
     System.out.println("-----------------class called Programmer--------------------------");
     drinkCoffe();
     Programmer programmer = new Programmer();
     programmer.printDetails(programmer.name, programmer.age);
     programmer.hasGlasses(programmer.name, programmer.wearsGlasses);
     System.out.println("------------------class called TestProgrammers1-------------------");
     drinkCoffe();
     TestProgrammes programmer1 = new TestProgrammes();
     programmer1.name = "Michele";
     programmer1.age = 40;
     programmer.printDetails(programmer1.name, programmer1.age);
     System.out.println("------------------class called TestProgrammers2--------------------");
     TestProgrammes programmer2 = new TestProgrammes();
     programmer2.name = " Giovanni ";
     programmer2.age = 54;
     programmer2.wearsGlasses = true;
     programmer.printDetails(programmer2.name, programmer2.age);
     programmer.hasGlasses(programmer2.name, programmer2.wearsGlasses);
    }
}







