import java.util.Collections;
import java.util.List;

public class StreamServis {
    public void sortStreams(List<Stream> streams) {
        Collections.sort(streams, new StreamComparator());
    }

}
