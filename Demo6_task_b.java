public class Demo6_task_b{

    public static void main(String[] args) {
       
        String line = "\033[33m+-----------+--------+\033[0m";
        String yellow = "\033[33m";
        String boltBlue = "\033[34;1m";
        String reset = "\033[0m";
        String red = "\033[35m";
        System.out.println(line);
        System.out.printf("%5$s| %1$s%2$-10s%3$s%5$s|  %1$s%4$-6s%3$s%5$s|\n",boltBlue,"NAME",reset,"AGE",yellow);
        System.out.println(line);
        System.out.printf("%5$s|%6$s %1$-10s%5$s|%6$s   %2$s%3$-5s%4$s%5$s|%6$s\n","Alice",red,"24",reset,yellow,reset);
        System.out.printf("%5$s|%6$s %1$-10s%5$s|%6$s   %2$s%3$-5s%4$s%5$s|%6$s\n","Bob",red,"30",reset,yellow,reset);
        System.out.println(line);

    }

}