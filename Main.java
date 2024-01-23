import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args) {
    StudyGroup studyGroup0 = new StudyGroup(0,  8);
    StudyGroup studyGroup1 = new StudyGroup(1,  5);
    StudyGroup studyGroup3 = new StudyGroup(2,  6);
    StudyGroup studyGroup2 = new StudyGroup(3,  7);
    StudyGroup studyGroup4 = new StudyGroup(4,  8);
    StudyGroup studyGroup5 = new StudyGroup(5,  5);
    StudyGroup studyGroup6 = new StudyGroup(6,  6);
    StudyGroup studyGroup7 = new StudyGroup(7,  7);

    Stream stream1 = new Stream();
    stream1.studyGroups.add(studyGroup0);
    stream1.studyGroups.add(studyGroup1);
    stream1.studyGroups.add(studyGroup2);
    stream1.studyGroups.add(studyGroup3);
    stream1.studyGroups.add(studyGroup4);

    Stream stream2 = new Stream();
    stream2.studyGroups.add(studyGroup5);
    stream2.studyGroups.add(studyGroup6);
    stream2.studyGroups.add(studyGroup7);
    StreamServis streamServis = new StreamServis();
    List<Stream> streams = new ArrayList<>();
    streams.add(stream1);
    streams.add(stream2);
    streamServis.sortStreams(streams);
    for (Stream stream : streams) {
     System.out.println();
     System.out.println(stream);

     for (StudyGroup group : stream) {
      System.out.println("StudyGroup ID"+group.getStudyGroup());
     }
    }


   } 
}
