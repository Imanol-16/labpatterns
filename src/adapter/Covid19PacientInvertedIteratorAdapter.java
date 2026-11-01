package adapter;

import java.util.ArrayList;
import java.util.List;
import adapter.InvertedIterator;
import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientInvertedIteratorAdapter implements InvertedIterator {
    private List<Symptom> symptomsList;
    private int position;

    // Metodo eraikitzailea pazientearen informazioa jasotzeko
    public Covid19PacientInvertedIteratorAdapter(Covid19Pacient pacient) {
        this.symptomsList = new ArrayList<>(pacient.getSymptoms());
        this.position = symptomsList.size() - 1; 
    }

    @Override
    public Object previous() {
        Symptom symptom = symptomsList.get(position);
        position--;
        return symptom;
    }

    @Override
    public boolean hasPrevious() {
        return position >= 0;
    }

    @Override
    public void goLast() {
        this.position = symptomsList.size() - 1;
    }
}