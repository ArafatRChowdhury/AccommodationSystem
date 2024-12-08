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
