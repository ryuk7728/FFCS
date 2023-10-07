package timetablelogic;

import java.util.*;

public class SubjectTeacherSlot {

	public final String subject;
    public final String teacher;
    public final HashSet<String> slot;

    public SubjectTeacherSlot(String subject, String teacher, HashSet<String> slot) {
        this.subject = subject;
        this.teacher = teacher;
        this.slot = slot;
    }
}
