package com.sanjula.oop.java.tutorials.week_6;

import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.ArrayList;

public class PersonTableModel extends AbstractTableModel {
    private String[] columnNames = {"Name", "Date of Birth", "Type"};
    private ArrayList<Person> list;

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

    }
}
