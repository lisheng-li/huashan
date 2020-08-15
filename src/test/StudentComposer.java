package test;

import java.util.*;

public class StudentComposer implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getScore() > s2.getScore()) {
			return 1;
		} else if (s1.getScore() < s2.getScore()) {
			return 0;
		} else {
			return s1.getId().compareTo(s2.getId());
		}
	}

}
