package learnPOJO;

import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.testng.annotations.Test;

public class testcls {
    @Test
    public void testMethod() throws SerializeException {
       // Product p = new Product("Shai paneer",160,"Punjabi","Delhi 39");
        Product p = new Product("santosh","paneer");
        //p.testJugaduPOJO("Santosh","narmada","sdj");

        JsonSerializer j = JsonSerializer.DEFAULT_READABLE;
        String finalJson = j.serialize(p);
        System.out.println(finalJson);
    }
}
