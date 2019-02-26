import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import com.google.common.base.Splitter;
public class GossipBus {

    private List<Driver> drivers;

    public String run(String file) {

        initializeDrivers(file);

        return "1";
    }

    private void initializeDrivers(String file) {
        drivers = Splitter.on(Pattern.compile("\r?\n")).splitToList(file)
                .stream()
                .map(Driver::new)
                .collect(Collectors.toList());
    }
}
