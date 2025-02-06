public class Meadow extends Area {
    public Meadow(String areaName,String areaDescription,CleaningStatus.Status cleaningStatus){
            super(areaName, areaDescription,cleaningStatus);
            }
    public String getareaName(){
       return "Meadow"; 
    }
    public String getareaDescription(){
        return "Area Description in progress";
    }
}
