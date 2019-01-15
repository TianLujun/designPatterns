package main;

public class PrintTitle {
    
    public static void title(String str) {
        String title = "";
        title += "----------------";
        title += str;
        for(;title.length() < 50;) {
            title += "-";
        }
        System.out.println(title);
    }
}
