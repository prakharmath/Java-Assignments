import javax.swing.JFrame; 
import javax.swing.JScrollPane; 
import javax.swing.JTable; 
public class Table
{ 
    JFrame f; 
    JTable j; 
    Table() 
    { 
        f = new JFrame(); 
        f.setTitle("Student Details"); 
        String[][] data = 
        { 
            { "19XY10001", "Sachin", "90" }, 
            { "19XY10002", "Laxman", "85" },
            { "19XY10003", "Rahul","95"}
        }; 
        String[] columnNames = { "Roll No.", "NAME", "Marks" }; 
        j = new JTable(data, columnNames); 
        j.setBounds(30, 40, 200, 300); 
        JScrollPane sp = new JScrollPane(j); 
        f.add(sp); 
        f.setSize(500, 200); 
        f.setVisible(true); 
    } 
    public static void main(String[] args) 
    { 
        new Table();
    } 
} 


