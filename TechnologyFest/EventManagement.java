package TechnologyFest;
import java.util.List;

public class EventManagement implements Runnable {

    private List<Participant> TechList;
    private String searchEvent;
    private int counter = 0;

    public int getCounter() {
        return counter;
    }


    public void setCounter(int counter) {
        this.counter = counter;
    }


    public String getSearchEvent() {
        return searchEvent;
    }


    public void setSearchEvent(String searchEvent) {
        this.searchEvent = searchEvent;
    }


    public List<Participant> getTechList() {
        return TechList;
    }


    public void setTechList(List<Participant> techList) {
        this.TechList = techList;
    }

    public void calculateRegistrationFee(List<Participant> list) throws InvalidEventException{
        for(Participant p : list){
            if(p.getEventName().equalsIgnoreCase("robocar")){
                p.setRegistrationFee(1000);
            }
            else if(p.getEventName().equalsIgnoreCase("papertalk")){
                p.setRegistrationFee(500);
            }
            else if(p.getEventName().equalsIgnoreCase("quiz")){
                p.setRegistrationFee(300);
            }
            else if(p.getEventName().equalsIgnoreCase("games")){
                p.setRegistrationFee(100);
            }
            else{
                throw new InvalidEventException("Event Name is invalid");
            }
        }
        setTechList(list);
    }

    @Override
    public void run() {
        String str ="robocarpapertalkquizgames"; 
        if(str.contains(this.getSearchEvent())){
            for(Participant p : this.getTechList()){
                if(this.getSearchEvent().equals(p.getEventName())){
                    counter++;
                }
            }
        }
        setCounter(counter);
    }
    
}
