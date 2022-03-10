import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class BaseTest {

    @Test
    public void test() {
        Map<String,Integer> map = new HashMap<>();
        Integer result = map.put("SSS", 1);
        System.out.println(result);
        result = map.put("SSS", 2);
        System.out.println(result);
    }
}
