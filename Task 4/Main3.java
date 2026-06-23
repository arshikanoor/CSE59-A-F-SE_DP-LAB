
interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

interface Fax {
    void fax();
}


class BasicPrinter implements Printer {

    @Override
    public void print() {
        System.out.println("Basic Printer: Printing document...");
    }
}

class SmartPrinter implements Printer, Scanner, Fax {

    @Override
    public void print() {
        System.out.println("Smart Printer: Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Smart Printer: Scanning document...");
    }

    @Override
    public void fax() {
        System.out.println("Smart Printer: Sending fax...");
    }
}


public class Main3 {

    public static void main(String[] args) {

        Printer basic = new BasicPrinter();
        basic.print();

        System.out.println("-----");

        SmartPrinter smart = new SmartPrinter();
        smart.print();
        smart.scan();
        smart.fax();
    }
}
