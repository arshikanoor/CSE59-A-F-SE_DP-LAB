interface HttpService {
    void handleHttpRequest();
}


interface DatabaseManager {
    void executeSqlStatement();
}


interface ContainerOps {
    void restartDockerContainer();
}


class WebController implements HttpService {

    @Override
    public void handleHttpRequest() {
        System.out.println("Routing traffic to endpoint.");
    }
}



class DatabaseService implements DatabaseManager {

    @Override
    public void executeSqlStatement() {
        System.out.println("Executing SQL statement.");
    }
}


class DockerManager implements ContainerOps {

    @Override
    public void restartDockerContainer() {
        System.out.println("Restarting Docker container.");
    }
}



public class Main {

    public static void main(String[] args) {

        HttpService webController = new WebController();
        webController.handleHttpRequest();


        DatabaseManager database = new DatabaseService();
        database.executeSqlStatement();


        ContainerOps docker = new DockerManager();
        docker.restartDockerContainer();
    }
}
