import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import org.junit.Assert;
import org.junit.Test;
public class GossipBusTest {

    private GossipBus testee = new GossipBus();

    @Test
    public void test1() {
        String result = testee.run(getFile("test1.txt"));
        Assert.assertEquals(result, "1");
    }

    @Test
    public void test2() {
        String result = testee.run(getFile("test2.txt"));
        Assert.assertEquals(result, "1");
    }

    @Test
    public void test3() {
        String result = testee.run(getFile("test3.txt"));
        Assert.assertEquals(result, "never");
    }

    @Test
    public void test4() {
        String result = testee.run(getFile("test4.txt"));
        Assert.assertEquals(result, "2");
    }

    @Test
    public void example1() {
        String result = testee.run(getFile("example1.txt"));
        Assert.assertEquals(result, "5");
    }

    @Test
    public void example2() {
        String result = testee.run(getFile("example2.txt"));
        Assert.assertEquals(result, "never");
    }

    private static String getFile(String filename) {

        InputStream resource = GossipBusTest.class.getResourceAsStream(filename);

        return new BufferedReader(new InputStreamReader(resource))
                .lines().collect(Collectors.joining("\n"));
    }
}
