package adapter;

import java.util.Comparator;
import domain.Symptom;

public class SymptomNameComparator implements Comparator<Object> {
    @Override
    public int compare(Object o1, Object o2) {
        Symptom s1 = (Symptom) o1; // Cast a Symptom
        Symptom s2 = (Symptom) o2;
        return s1.getName().compareToIgnoreCase(s2.getName());
    }
}