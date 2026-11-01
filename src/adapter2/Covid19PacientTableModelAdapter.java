package adapter2;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import domain.Covid19Pacient;
import domain.Symptom;

public class Covid19PacientTableModelAdapter extends AbstractTableModel {
	  protected Covid19Pacient pacient;
	  protected String[] columnNames =
	    new String[] {"Symptom", "Weight" };
	  protected Vector<Symptom> symptoms;

	  public Covid19PacientTableModelAdapter(Covid19Pacient p) {
	    this.pacient=p;
	    symptoms = new Vector<>(p.getSymptoms());
	  }

	  public int getColumnCount() {
	    // Challenge!
		 return 2;
	  }

	  public String getColumnName(int i) {
	    // Challenge!
		  return columnNames[i];
	  }

	  public int getRowCount() {
	    // Challenge!
		  return pacient.getSymptoms().size();
	  }

	  public Object getValueAt(int row, int col) {
		 symptoms = new Vector<>(pacient.getSymptoms());
	    // Challenge!
		  if(col == 0) {
			  return symptoms.get(row).getName();
		  }
		  if(col == 1) {
			  return pacient.getWeight(symptoms.get(row));
		  }
		  return null;
	  }
}
