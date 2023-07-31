public class Demo6_task_a {
    
    public static void main(String[] args) {
        
        String redBg ="\033[41m";
        String greenBg = "\033[42m";
        String reset = "\033[0m";

        System.out.printf("%s[%6d%s%-6s]%s\n",redBg,5,greenBg,"0%",reset);

    }

}
