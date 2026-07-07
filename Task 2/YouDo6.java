class Applet {

    public void launch() {
        System.out.println("Applet launched");
    }
}


class GameApplet extends Applet {

    public void play() {
        System.out.println("Playing game");
    }
}


public class Main {

    public static void main(String[] args) {

     
        GameApplet game = new GameApplet();

  
        game.launch();


        game.play();
    }
}
