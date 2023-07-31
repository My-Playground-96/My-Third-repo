public class Demo6_task_d {
    
    public static void main(String[] args) {
        
        String line = "\033[33m+--------+----------+-------+\033[0m";
        String yellow = "\033[33m";
        String bolt = "\033[0;1m";
        String reset = "\033[0m";
        String red = "\033[31m";
        String blue = "\033[34m";
        String green = "\033[32m";
        System.out.println(line);
        System.out.printf("%5$s| %1$s%2$-7s%3$s%5$s| %1$s%4$-8s%3$s%5$s | %1$s%-6s%6$s%5$s |\n",bolt,"ITEM",reset,"QUANTITY",yellow,"PRICE");
        System.out.println(line);
        System.out.printf("%5$s|%6$s %1$-7s%5$s|%6$s %2$s%3$8s%5$s |%6$s %9$s$%8$s%7$s%5$s |%6$s\n","Apples",blue,"5",reset,yellow,reset,"0.99",red,green);
        System.out.printf("%5$s|%6$s %1$-7s%5$s|%6$s %2$s%3$8s%5$s |%6$s %9$s$%8$s%7$s%5$s |%6$s\n","Oranges",blue,"10",reset,yellow,reset,"1.49",red,green);
        //System.out.printf("%5$s|%6$s %1$-14s%5$s|%6$s   %2$s%3$-7s%4$s%5$s|%6$s%6$s   %2$s%3$-9s%4$s%5$s|%6$s\n","Bob",red,"30",reset,yellow,reset);
        System.out.println(line);

    }
}
