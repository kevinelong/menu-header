class Menu {
    String pattern;
    int width;
    int padding;
    String SPACE = " ";

    Menu(String pattern, int width, int padding) {
        this.pattern = pattern;
        this.width = width;
        this.padding = padding;
    }

    public String repeat(String s, int times) {
        StringBuilder output = new StringBuilder();

        while (output.length() < times) {
            output.append(s);
        }
        return output.toString();
    }

    public int getCenter() {
        return (int) Math.floor(this.width / 2.0);
    }

    public void header(String message) {
        String pad = repeat(pattern, padding);
        int hm = (int) Math.ceil(message.length() / 2.0);
        String spacing = repeat(SPACE, getCenter() - hm - pad.length());
        String spacing2 = spacing;
        if (width > pad.length() + spacing2.length() + message.length() + spacing2.length() + pad.length()) {
            spacing2 += SPACE;
        }
        System.out.printf("%s\n", repeat(pattern, width));

        System.out.printf("%s%s%s%s%s\n",
                pad,
                spacing,
                message,
                spacing2,
                pad);

        System.out.printf("%s\n", repeat(pattern, width));
    }
}

public class Main {
    public static void main(String[] args) {
        Menu m = new Menu("#", 40, 6);
        m.header("Home Menu");
        System.out.println();
        System.out.println();
        m.header("The Full Ledger Menu");
    }
}
/*
========================================
=        The Full Ledger Menu        =
========================================
 */