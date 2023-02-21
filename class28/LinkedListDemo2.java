package class28;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList<String> subjects=new LinkedList<>();
        subjects.add("SDLC");//linkedList is a name that you can choose
        subjects.add("Manuel Testing");
        subjects.add("Jira");
        subjects.add("Git");
        subjects.add("Java");
        LinkedList<String> futureSubjects=new LinkedList<>();
        futureSubjects.add("Selenium");
        futureSubjects.add("Testing");
        futureSubjects.add("cucumber");
        futureSubjects.add("sql");
        futureSubjects.add("APIs");
        futureSubjects.add("Jenkins");
        LinkedList<String>allSubjects=new LinkedList<>();
        allSubjects.addAll(subjects);
        allSubjects.addAll(futureSubjects);
        System.out.println(allSubjects);

        LinkedList<String> subjectsILike=new LinkedList<>();
        subjectsILike.add("Java");
        subjectsILike.add("SDLC");
        subjectsILike.add("SQL");
        System.out.println(subjectsILike);
        allSubjects.removeAll(subjectsILike);
        System.out.println(allSubjects);
    }
}
