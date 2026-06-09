
class Sensor{
    String name;
    int batteryLevel;
    void charge(){
        batteryLevel = 100;
        System.out.println("Sensor fully charged");
    }}
    public class main4{
        public static void main(String[]args){
            Sensor obj = new Sensor();
            obj.charge();
            System.out.println("Battery Level: " + obj.batteryLevel);
        }
    }
