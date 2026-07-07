interface Clickable {

    void onClick();
}


class Button implements Clickable {

    @Override
    public void onClick() {
        System.out.println("Button was clicked!");
    }
}


public class Main {

    public static void main(String[] args) {


        Button button = new Button();

        button.onClick();
    }
}
