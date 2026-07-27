public enum Day {
    SUNDAY(10),
    MONDAY(7),
    TUESDAY(7),
    WEDNESDAY(8),
    THURSDAY(8),
    FRIDAY(0),
    SATURDAY(0);

    private int workingHours;
    Day(int workingHours){
        this.workingHours=workingHours;
        System.out.println("Default Constructor of Day");
    }

    public int getWorkingHours(){
        return  workingHours;
    }
}
