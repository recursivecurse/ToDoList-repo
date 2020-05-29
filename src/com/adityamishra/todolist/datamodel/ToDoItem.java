package com.adityamishra.todolist.datamodel;

import javafx.scene.control.DatePicker;

import java.time.LocalDate;
import java.util.Date;

public class ToDoItem {
    private String shortDescription;
    private String details;
    private DatePicker date;

    public ToDoItem(String shortDescription, String details, DatePicker date) {
        this.shortDescription = shortDescription;
        this.details = details;
        this.date = date;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getDetails() {
        return details;
    }

    public DatePicker getDate() {
        return date;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setDate(DatePicker date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return shortDescription;
    }
}
