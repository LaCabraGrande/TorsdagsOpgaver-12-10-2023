package Task1;

public class Letter {


    public void methodA(String input) {
        System.out.print("j ");
        if(input.equals("Java")) {
            System.out.print("a ");
            methodB("v");
        }
        System.out.print("t");
    }
    public void methodB(String input) {
        System.out.print(input);
        System.out.print(" a ");
        methodC("Java");
    }
    public void methodC(String input) {
        System.out.print("e");
        if(input.length() == 4) {
            System.out.print(" r");
            methodD("s");
        }

    }
    public void methodD(String input) {
        System.out.print(" "+input+" ");
        if (input == "s") {
            System.out.print("j o v ");
        }
    }
}
