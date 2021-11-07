import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class server {

    public static void main(String[] args) {
        try {
            intImpl obj = new intImpl();

            LocateRegistry.createRegistry(6789);
            Registry reg = LocateRegistry.getRegistry(6789);
            System.out.println("Khoi tao doi tuong thanh cong...");

            reg.rebind("rmi", obj);

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
