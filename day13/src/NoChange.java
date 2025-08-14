import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NoChange {
    public static void main(String[] args) {
        HashMap<String,String> hm =new HashMap<>();
        Map<String, String> map = Map.copyOf(hm);

        map.put("1","1");
    }
}