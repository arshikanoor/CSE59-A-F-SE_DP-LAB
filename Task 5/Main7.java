interface INetworkProtocol {
    void broadcastMessage(String msg);
}



class BluetoothMeshNetwork implements INetworkProtocol {

    @Override
    public void broadcastMessage(String msg) {
        System.out.println("Broadcasting via Bluetooth Mesh: " + msg);
    }
}


class WiFiDirectNetwork implements INetworkProtocol {

    @Override
    public void broadcastMessage(String msg) {
        System.out.println("Broadcasting via WiFi Direct: " + msg);
    }
}


class DisasterAlertSystem {

    private INetworkProtocol network;

    public DisasterAlertSystem(INetworkProtocol network) {
        this.network = network;
    }

    public void triggerAlert(String alertData) {
        network.broadcastMessage(alertData);
    }
}



public class Main {

    public static void main(String[] args) {


        INetworkProtocol bluetoothNetwork =
                new BluetoothMeshNetwork();

        DisasterAlertSystem bluetoothAlertSystem =
                new DisasterAlertSystem(bluetoothNetwork);

        bluetoothAlertSystem.triggerAlert(
                "Earthquake detected! Evacuate immediately."
        );


        INetworkProtocol wifiNetwork =
                new WiFiDirectNetwork();

        DisasterAlertSystem wifiAlertSystem =
                new DisasterAlertSystem(wifiNetwork);

        wifiAlertSystem.triggerAlert(
                "Flood warning! Move to higher ground."
        );
    }
}
