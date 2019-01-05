package programmenentukanbadanideal;

import javax.swing.table.DefaultTableModel;

public class TabelHistory {
    DefaultTableModel tabel = new DefaultTableModel();
     public TabelHistory(){
        getTabel().addColumn("Name");
        getTabel().addColumn("Height");
        getTabel().addColumn("Weight");
        getTabel().addColumn("Body Mass Index");
        getTabel().addColumn("State Of The Body");
    }
public DefaultTableModel getTabel() {
        return tabel;
    }
}
