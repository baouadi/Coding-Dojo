import java.util.HashMap;
import java.util.Set;
public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> albumMap = new HashMap<String, String>();
        albumMap.put("The Grudge", "Wear the grudge like a crown of negativity...");
        albumMap.put("Schism", "I know the pieces fit...");
        albumMap.put("The Patient", "A groan of tedium escapes me startling the fearful...");
        albumMap.put("Parabola", "We barely remember who or what came before this precious moment...");
    
        String name = albumMap.get("Parabola");
        System.out.println(name);

        Set<String> keys = albumMap.keySet();
        for(String key : keys) {
            System.out.println(key+" : "+albumMap.get(key));   
        }
    
    }  }