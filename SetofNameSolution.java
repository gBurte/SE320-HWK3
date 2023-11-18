import java.util.LinkedHashSet;

public class SetofNameSolution {
    public static void main(String[] args) {
        // Create the first linked hash set
        LinkedHashSet<String> NameSet1 = new LinkedHashSet<>();
        NameSet1.add("George");
        NameSet1.add("Jim");
        NameSet1.add("John");
        NameSet1.add("Blake");
        NameSet1.add("Kevin");
        NameSet1.add("Michael");

        // Create the second linked hash set
        LinkedHashSet<String> NameSet2 = new LinkedHashSet<>();
        NameSet2.add("George");
        NameSet2.add("Katie");
        NameSet2.add("Kevin");
        NameSet2.add("Michelle");
        NameSet2.add("Ryan");

        LinkedHashSet<String> set1Clone = new LinkedHashSet<>(NameSet1);
        LinkedHashSet<String> set2Clone = new LinkedHashSet<>(NameSet2);

        set1Clone.addAll(set2Clone);
        System.out.println("Question 1 Part a. Union: " + set1Clone);

        set1Clone = new LinkedHashSet<>(NameSet1);
        set2Clone = new LinkedHashSet<>(NameSet2);

        set1Clone.removeAll(set2Clone);
        System.out.println("Question 1 Part b. Difference: " + set1Clone);

        set1Clone = new LinkedHashSet<>(NameSet1);
        set2Clone = new LinkedHashSet<>(NameSet2);

        set1Clone.retainAll(set2Clone);
        System.out.println("Question 1 Part c. Intersection: " + set1Clone);
    }
}
