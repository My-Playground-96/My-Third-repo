public class Demo4 {

    public static void main(String[] args) {
        
        int date = 28;
        int mounth = 12;
        int year = 2023;
        int hour = 23;
        int minutes = 59;
        int seconds = 59;

        System.out.printf("\033[032m%s\033[0m/\033[033m%s\033[0m/\033[034m%s\033[35m %s\033[0m:\033[36m%s\033[0m:\033[30m%s\n",mounth,date,year,hour,minutes,seconds);

    }
    
}
