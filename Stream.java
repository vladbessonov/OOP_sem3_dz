import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup>{
    public List<StudyGroup> studyGroups = new ArrayList<>();


    @Override
    public Iterator<StudyGroup> iterator() {
        return studyGroups.iterator();
    }

}


