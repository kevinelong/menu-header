class Menu{
    String pattern;
    int width;
    int padding;
    String SPACE = " ";
    Menu(String pattern, int width, int padding){
        this.pattern = pattern;
        this.width = width;
        this.padding = padding;
    }
    public String repeat(String s, int times){
        String output = "";
        while(output.length() < times){
            output = output + s;
        }
        return output;
    }
    public int getCenter(){
        return (int) Math.ceil(this.width / 2.0);
    }
    public void header(String message){
        String pad = repeat(pattern, padding);
        String spacing = repeat(SPACE, getCenter() - (message.length() / 2) - (pad.length() * 2));
        System.out.printf("%s\n", repeat(pattern, width));
        System.out.printf("%s%s%s%s%s\n",
                pad,
                spacing,
                message,
                spacing,
                pad);
        System.out.printf("%s\n", repeat(pattern, width));
    }
}
public class Main {
    public static void main(String[] args) {
        Menu m = new Menu("=-.-=", 40, 1);
        m.header("Main");
        System.out.println("");
        System.out.println("");
        m.header("The Full Ledger Menu");
    }
}