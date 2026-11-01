package adapter;

import java.util.Iterator;
import adapter.Sorting;
import domain.Covid19Pacient;
import factory.FactorySympton;

public class MainAdapterIterator {
    public static void main(String[] args) {
        // 1. Pazientea sortu 5 sintomarekin
        Covid19Pacient pacient = new Covid19Pacient("Ane", 29, new FactorySympton());
        pacient.addSymptomByName("fiebre", 2);
        pacient.addSymptomByName("tos seca", 1);
        pacient.addSymptomByName("astenia", 3);
        pacient.addSymptomByName("disnea", 2);
        pacient.addSymptomByName("cefalea", 1);

        // 2. Egokitzailea (Adapter) sortu pazientearen datuekin
        Covid19PacientInvertedIteratorAdapter adapter = new Covid19PacientInvertedIteratorAdapter(pacient);

        // 3. Izenaren arabera ordenatu eta inprimatu
        System.out.println("--- Sintomak IZENAREN arabera ordenatuta ---");
        Iterator<Object> itByName = Sorting.sortedIterator(adapter, new SymptomNameComparator());
        while(itByName.hasNext()) {
            System.out.println(itByName.next());
        }

        // 4. Larritasun indizearen arabera ordenatu eta inprimatu
        System.out.println("\n--- Sintomak LARRITASUN INDIZEAREN (severityIndex) arabera ordenatuta ---");
        Iterator<Object> itBySeverity = Sorting.sortedIterator(adapter, new SeverityIndexComparator());
        while(itBySeverity.hasNext()) {
            System.out.println(itBySeverity.next());
        }
    }
}