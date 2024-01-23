import javax.swing.*;

import java.time.LocalDateTime;
public class Main {
    public static void main(String[] args) {
        Check();
    }

    public static void Check(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
    }
}
