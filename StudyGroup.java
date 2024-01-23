public class StudyGroup  {
    int studyGroupId;
    int numOfStudents;

    public StudyGroup(int studyGroupId,  int numOfStudents) {
        this.studyGroupId = studyGroupId;
        this.numOfStudents = numOfStudents;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "studyGroupId=" + studyGroupId +
                ", numOfStudents=" + numOfStudents +
                '}';
    }

    public int getStudyGroup() {
        return studyGroupId;
    }
}
