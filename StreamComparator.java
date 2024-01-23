import java.util.Comparator;
public class StreamComparator implements Comparator<Stream>{
    @Override
    public int compare(Stream stream1, Stream stream2) {
        return Integer.compare(stream1.studyGroups.size(), stream2.studyGroups.size());
    }
}
