package TechnologyFest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new SkeletonValidator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of entries");
        int n = scanner.nextInt();
        System.out.println("Enter the Participant Name/Yearofstudy/Department/CollageName/EventName");
        List<Participant> list = new ArrayList<Participant>();
        String strlist[] = new String[n];
        for (int i = 0; i < n; i++){
            strlist[i] = scanner.next();
            String a[] = strlist[i].split("/");
            Participant pt = new Participant(a[0], a[1], a[2], a[3], a[4]);
            list.add(pt);
        } 
        EventManagement em = new EventManagement();
        try {
            em.calculateRegistrationFee(list);
        } catch (InvalidEventException e) {
            e.printStackTrace();
        }

        System.out.println("Print participant details");
        for (Participant p :list){
            System.out.println(p);
        }
        System.out.println("Enter the event to search");
        String srch = scanner.nextLine();
        em.setSearchEvent(srch);
        em.run();
        // Thread t = new Thread();
        // t.start();
        int count = em.getCounter();
        if(count <= 0){
            System.out.println("No participant found");
        }
        else{
            System.out.println("Number of participant for: " + srch + " event is "+count);
        }
    }
}
