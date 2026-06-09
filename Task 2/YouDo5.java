class Printer {

    void printData(String text) {
        System.out.println("Text: " + text);
    }

    void printData(int number) {
        System.out.println("Number: " + number);
    }
}

public class main5 {
    public static void main(String[] args) {
        Printer print = new Printer();

        print.printData("Hello, World!");
        print.printData(100);
    }
}
