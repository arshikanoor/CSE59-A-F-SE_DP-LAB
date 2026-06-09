class Countdown {
    public void start() {
        for (int i = 5; i >= 1; i--)
        {
            System.out.println(i);
        }
        System.out.println("Go!");}}
        public class main3{
            public static void main(String[]args){
                Countdown number  = new Countdown();
                number.start();
            }
        }
