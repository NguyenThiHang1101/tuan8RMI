import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class client {
    static Scanner sc;

    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
        try {
            Registry reg = LocateRegistry.getRegistry("localhost", 6789);
            StringInterface obj = (StringInterface) reg.lookup("rmi");

            while (true) {

                System.out.println("|Chon 1||IN HOA CHU DAU\n" + "|Chon 2||DAO NGUOC CHUOI\n"
                        + "|chon 0||bai lam duoc hoan thanh!\n");
                System.out.print("Chon phương thuc bạn muon thuc hien:");
                sc = new Scanner(System.in);
                String choose = sc.nextLine();
                if (choose.equals("0")) {
                    System.out.println("chuc mung da hoan thanh bai RMI!");
                    break;
                } else if (choose.equals("1")) {
                    System.out.println("------- NHAP CHU BAN MUON THAY DOI------------");

                    sc = new Scanner(System.in);
                    String a = sc.nextLine();
                    System.out.println("------kET QUA SAU KHI THUC HIEN:" + obj.upperCase(a) + "\n\n");
                } else if (choose.equals("2")) {
                    System.out.println("----------NHAP CHU BAN MUON THAY DOI-----------");

                    sc = new Scanner(System.in);
                    String str = sc.nextLine();
                    System.out.println("------kET QUA SAU KHI THUC HIEN:" + obj.reverse(str) + "\n\n");

                }
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
