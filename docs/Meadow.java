package groupproject.accommodationsystem;
public class Meadow extends Area {
    public Meadow(String areaName,String areaDescription){
            super(areaName, areaDescription);
            }
    public String getareaName(){
       return "Meadow"; 
    }
    public String getareaDescription(){
        return areaDescription;
    }
}
