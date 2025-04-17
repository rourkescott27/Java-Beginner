package classWork;

public class ClassWork {
    public String name1 = "Fred Smith";
    public String name2 = "John Smith";
//    public String name2 = "fred smith";
    int age = 50;

    public static void main ( String[] args ) {
        ClassWork cw = new ClassWork();
        cw.areNamesEqual();

        if(cw.age < 12 || cw.name1.startsWith("F")) {
            System.out.println("Found Him!");
        } else {
            System.out.println("Not Found!");
        }

    }

    public void areNamesEqual() {
        if (name1.equals(name2)) {
            System.out.println("Same name.");
        } else {
            System.out.println("Different name.");
        }
    }

}
