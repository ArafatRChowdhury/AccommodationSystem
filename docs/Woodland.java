public class Woodland extends Area {
    public Woodland(String areaName,String areaDescription,CleaningStatus.Status cleaningStatus){
            super(areaName, areaDescription,cleaningStatus);
            }
    public String getareaName(){
       return "Woodland"; 
    }
    public String getareaDescription(){
        return "Area Description in progress";
    }
}
