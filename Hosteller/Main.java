package Hosteller;
import java.util.*;
public class Main {

    public static Hosteller getHostellerDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Details:");
        System.out.println("Student Id");
        int id = sc.nextInt();

        System.out.println("Student Name");
        String name = sc.next();

        System.out.println("Department Id");
        int department = sc.nextInt();

        System.out.println("Gender");
        String gender = sc.next();

        System.out.println("Phone Number");
        String phone = sc.next();

        System.out.println("Hostal Name");
        String hostal = sc.next();

        System.out.println("Room Number");
        int room = sc.nextInt();

        Hosteller hosteller = new Hosteller();

        hosteller.setStudentId(id);
        hosteller.setName(name);
        hosteller.setDepartmentId(department);
        hosteller.setGender(gender);
        hosteller.setPhone(phone);
        hosteller.setHostelName(hostal);
        hosteller.setRoomNumber(room);

        return hosteller;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hosteller hosteller = getHostellerDetails();

        System.out.println("Modify Room Number");
        boolean updateRoom = sc.next().equals("Y");

        if(updateRoom) {
            System.out.println("New Room Number(Y/N)");
            int room = sc.nextInt();
            hosteller.setRoomNumber(room);
        }

        System.out.println("Modify Phone Number(Y/N)");
        boolean updatePhone = sc.next().equals("Y");

        if(updatePhone) {
            System.out.println("New Phone Number");
            String phone = sc.next();
            hosteller.setPhone(phone);
        }

        sc.close();

        StringJoiner joiner = new StringJoiner(" ");
        joiner.add(String.valueOf(hosteller.getStudentId())).add(hosteller.getName())
        .add(String.valueOf(hosteller.getDepartmentId())).add(hosteller.getGender())
        .add(hosteller.getPhone()).add(hosteller.getHostelName())
        .add(String.valueOf(hosteller.getRoomNumber()));

        System.out.println("The Student Details:");
        System.out.println(joiner.toString());
    }
}
