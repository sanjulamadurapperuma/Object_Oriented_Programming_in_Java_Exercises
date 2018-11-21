package com.sanjula.oop.java.tutorials.week_6;

import com.sanjula.oop.java.tutorials.week_1.Question_3.Date;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.util.ArrayList;

public class PersonTableModel extends AbstractTableModel {
    private static String[] columnNames = {"Name", "Date of Birth", "Type"};//Made static so
                                    // that values stay same despite creating new objects
    private static ArrayList<Person> list;

    public PersonTableModel(ArrayList<Person> personList) {
        this.list = personList;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object temp = null;
        if (columnIndex == 0){
            temp = list.get(rowIndex).getName();
        } else if(columnIndex == 1){
            temp = list.get(rowIndex).getDateOfBirth().getDate();
        } else if (columnIndex == 2){
            if (list.get(rowIndex) instanceof Teacher){
                temp = "Teacher";
            } else{
                temp = "Student";
            }
        }
        return temp;
    }

    //needed to show column names in JTable
    public String getColumnName(int col){
        return columnNames[col];
    }

    public static void main(String[] args) {
        Person person1 = new Teacher("John", new Date(25, 12, 1983), 25000);
        Person person2 = new Student("Kate", new Date(12, 01, 1998), 012, "SE");
        Person person3 = new Teacher("David", new Date(05, 02, 1973), 50000);

        String data[][]={{person1.getName(), person1.getDateOfBirth().toString(),"Teacher"},
                {person2.getName(),person2.getDateOfBirth().toString(),"Student"},
                {person3.getName(),person3.getDateOfBirth().toString(),"Teacher"}};
        //Add student and teacher objects to a Two-Dimensional String array

        JFrame frame = new JFrame("Person");
        JTable myTable = new JTable(data, columnNames);

        // color code the cell indicating the type of person: if it is a
        // teacher is green, if student, blue
        myTable.getColumnModel().getColumn(2).setCellRenderer(new DefaultTableCellRenderer(){
            Color originalColor = null;

            @Override
            public Component getTableCellRendererComponent(
                    JTable table, Object value, boolean isSelected,
                    boolean hasFocus, int row, int column){

                Component renderer = super.getTableCellRendererComponent(table,
                        value, isSelected, hasFocus, row, column);//Pass the parameters to the
                                                    // getTableCellRendererComponent method

                //check the type and set the render accordingly
                if(value == "Teacher"){
                    renderer.setBackground(Color.GREEN);
                } else{
                    renderer.setBackground(Color.BLUE);
                }
                return renderer;
            }
        });

        frame.add(myTable);//Add table to the JFrame
        frame.setSize(400, 100);//Dimensions of the Frame
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
