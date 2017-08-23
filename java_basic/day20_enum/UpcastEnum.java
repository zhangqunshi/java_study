import java.util.*;
import java.lang.reflect.*;

enum Search {
    HITHER, YON
}

public class UpcastEnum {

    public static void main(String[] args) {
        Enum x = Search.YON;
        for (Enum y: x.getClass().getEnumConstants()) {
            System.out.println(y);
        }

        Search[] y = Search.values();
    }

}
