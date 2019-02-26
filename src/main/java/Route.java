import java.util.List;
import java.util.stream.Collectors;
import com.google.common.base.Splitter;
public class Route {

    private final List<Integer> stops;

    private int currentStop = -1;

    public Route(String line) {
        this.stops = Splitter.on(" ").splitToList(line)
                .stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public Integer nextStop() {
        if (currentStop < 0 || currentStop > stops.size()) {
            currentStop = 0;
        } else {
            currentStop++;
        }
        return this.stops.get(currentStop);
    }
}
