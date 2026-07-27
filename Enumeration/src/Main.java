public class Main{
    public static void main(String[] args){
        Day day1= Day.MONDAY;
        System.out.println(day1.getWorkingHours());

        System.out.println(day1.ordinal());
        System.out.println(day1.name());

        Day d3 = Day.valueOf("TUESDAY");
        System.out.println(d3);

        Day[] allDays = Day.values();
        System.out.println(allDays);
        for(var d:allDays){
            System.out.println(d);
        }
    }
}