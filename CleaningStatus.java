public enum CleaningStatus {
    CLEAN("Clean"),
    DIRTY("Dirty"),
    MAINTENANCE("Maintenance");

    private String cleaningStatus;

    CleaningStatus(String cleaningStatus) {
        this.cleaningStatus = cleaningStatus;
    }

    public String getCleaningStatus() {
        return cleaningStatus;
    }

    public void updateCleaningStatus(String newCleaningStatus) {
        this.cleaningStatus = newCleaningStatus;
    }
    public static void main(String[] args) {

    } 
}

/*Code made by Jaime for the Change Cleaning Status Class
public class CleaningStatus {
    public enum cleaningStatus {
        CLEAN,
        MAINTENANCE,
        DIRTY
    }
    public static void main(String []args){
        cleaningStatus cleaningstatus = cleaningStatus.CLEAN;
        switch(cleaningstatus){
            case CLEAN -> System.out.println("The accommodation is clean");
            case MAINTENANCE -> System.out.println("The accommodation is in maintenance");
            case DIRTY -> System.out.println("The accommodation is dirty");
        }
    }
      
}
*/
