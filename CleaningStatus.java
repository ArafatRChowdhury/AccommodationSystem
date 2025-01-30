public class CleaningStatus {
    public enum Status {
        CLEAN,
        MAINTENANCE,
        DIRTY;
    }

    public static void main(String[] args) {
        Status currentStatus = Status.CLEAN;

        switch (currentStatus) {
            case CLEAN -> System.out.println("The accommodation is clean.");
            case MAINTENANCE -> System.out.println("The accommodation is in maintenance.");
            case DIRTY -> System.out.println("The accommodation is dirty.");
        }
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
