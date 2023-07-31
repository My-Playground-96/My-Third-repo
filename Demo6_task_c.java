public class Demo6_task_c {
    public static void main(String[] args) {
        
        String line = "\033[33m+---------------+----------+------------+\033[0m";
        String yellow = "\033[33m";
        String bolt = "\033[0;1m";
        String reset = "\033[0m";
        String red = "\033[35m";
        System.out.println(line);
        System.out.printf("%5$s| %1$s%2$-14s%3$s%5$s|  %1$s%4$-8s%3$s%5$s| %1$s%-6s%6$s%5$s |\n",bolt,"CITY",reset,"STATE",yellow,"POPULATION");
        System.out.println(line);
        System.out.printf("%5$s|%6$s %1$-14s%5$s|%6$s %3$-7s%4$s%5$s|%6$s%6$s  %2$s%7$,d%5$s |%6$s\n","Los Ageless",red,"Calfornia",reset,yellow,reset,3966936);
        System.out.printf("%5$s|%6$s %1$-23s%5$s|%6$s %2$s%3$2s %4$s%5$s|%6$s%6$s  %2$s%7$,d%5$s |%6$s\n","\033[32mNew \033[0mYork",red,"\033[32mNew \033[0mYork",reset,yellow,reset,8336817);
        //System.out.printf("%5$s|%6$s %1$-14s%5$s|%6$s   %2$s%3$-7s%4$s%5$s|%6$s%6$s   %2$s%3$-9s%4$s%5$s|%6$s\n","Bob",red,"30",reset,yellow,reset);
        System.out.println(line);

    }

        
    
}
