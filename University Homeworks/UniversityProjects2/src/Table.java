import java.util.ArrayList;

public class Table {
    private String[][] table;
    private int row;
    private int col;

    public Table(String[][] table, int row, int col) {
        this.table = table;
        this.row = row;
        this.col = col;
    }

    public Table() {
    }

    public String[][] getTable() {
        return table;
    }

    public void setTable(String[][] table) {
        this.table = table;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    //Method to print the table
    public void printTable() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    //method to add cell to the table
    public void addCell(String cell, int row, int col) {
        table[row][col] = cell;
    }

    //method to get cell from the table
    public String getCell(int row, int col) {
        return table[row][col];
    }

    //method to remove cell from the table
    public void removeCell(int row, int col) {
        table[row][col] = "";
    }

    //method to fill the table with random values
    public void fillTable() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                table[i][j] = String.valueOf(Math.random());
            }
        }
    }
}
