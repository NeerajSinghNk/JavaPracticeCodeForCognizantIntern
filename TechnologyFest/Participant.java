package TechnologyFest;

public class Participant {

    String name;
    String yearofstudy;
    String department;
    String collageName;
    String eventName;
    double registrationFee;

    public Participant(String name, String yearofstudy, String department, String collageName, String eventName) {
        this.name = name;
       this.yearofstudy = yearofstudy;
        this.department = department;
        this.collageName = collageName;
        this.eventName = eventName;
    }
   
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getYearOfStudy(){
        return yearofstudy;
    }
    public void setYearOfStudy(String yearofstudy){
        this.yearofstudy = yearofstudy;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getColageName(){
        return collageName;
    }
    public void setCollageName(String collageName){
        this.collageName = collageName;
    }
    public String getEventName(){
        return eventName;
    }
    public void setEventName(String eventName){
        this.eventName = eventName;
    }
    public double getRegistrationFee(){
        return registrationFee;
    }
    public void setRegistrationFee(double registrationFee){
        this.registrationFee = registrationFee;
    }

    @Override
    public String toString(){
        return "ParticipantName="+ name +", Yearofstudy="+ yearofstudy +", Department="+ department +", CollageName="+ collageName +", EventName="+ eventName +", RegistrationFee="+ registrationFee ;
    }
   

}
