package timetablelogic;

import java.util.*;
public class SubjectTeacherSlotEmbedded {

	public final String subject;
    public final String teacher;
    public final List<List<String>> slot;

    public SubjectTeacherSlotEmbedded(String subject, String teacher, List<List<String>> slot) {
        this.subject = subject;
        this.teacher = teacher;
        this.slot = slot;
    }
}
