import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Table")
@XmlAccessorType(XmlAccessType.FIELD)
public class Table {

    @XmlElement(name = "rows")
    private int rows;

    @XmlElement(name = "columns")
    private int columns;

    @XmlElement(name = "table")
    private String[][] table;

    public Table(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        table = new String[rows][columns];
    }

    public Table(int rows, int columns, String[][] table) {
        this.rows = rows;
        this.columns = columns;
        this.table = table;
    }

    public Table() {
    }

    public int getRows() {
        return this.rows;
    }

    public int getColumns() {
        return this.columns;
    }

    public String[][] getTable() {
        return this.table;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public void setTable(String[][] table) {
        this.table = table;
    }

    //get the value of cell of the table
    public String getValue(int row, int column) {
        return this.table[row][column];
    }

    //set the value of cell of the table
    public void setValue(int row, int column, String value) {
        this.table[row][column] = value;
    }

    //fill the table with random values
    public void fillRandom() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                table[i][j] = String.valueOf(Math.round((Math.random() * 10)));
            }
        }
    }

    //check if cell is in bounds
    public boolean isInBounds(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    //print the table
    public void print() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                System.out.print("\t" + this.table[i][j] + "\t" + "|" + "\t");
            }
            System.out.println();
        }
    }

    //return the table as a string
    @Override
    public String toString() {
        var result = new StringBuilder();
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                result.append(this.table[i][j]).append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
