package com.adityamishra.todolist;

import com.adityamishra.todolist.datamodel.ToDoItem;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<ToDoItem> todoitems = new ArrayList<>();
    @FXML
    private ListView<ToDoItem> todolistview;
    @FXML
    private TextArea detailPage;
    @FXML
    private TextArea detailDes;
    @FXML
    private TextField shortDes;
    @FXML
    private DatePicker date;

//    public void initialize()
//    {
//        ToDoItem item1 = new ToDoItem("Go for a run","Go for a morning walk in the stadium",new DatePicker(
//                LocalDate.of(2020, Month.APRIL,24)));
//        ToDoItem item2 = new ToDoItem("Take bath","Get ready for a bath ",new DatePicker(LocalDate.of(2020,Month.APRIL
//        ,24)));
//        ToDoItem item3 = new ToDoItem("Prepare breakfast","Make a bowl of oatmeal",new DatePicker(LocalDate.of(
//                2020,Month.APRIL,24
//        )));
//
//        todoitems.add(item1);
//        todoitems.add(item2);
//        todoitems.add(item3);
//
//        todolistview.getItems().setAll(todoitems);
//        todolistview.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
//
//
//    }

    public void handleItem()
    {
        ToDoItem item =  todolistview.getSelectionModel().getSelectedItem();
        //detailPage.setText(item.getDetails());
        StringBuilder sb = new StringBuilder(item.getDetails());
        sb.append("\n\n\n");
        sb.append(item.getDate().getValue().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        detailPage.setText(sb.toString());


    }
    @FXML
    public void addTask()
    {

        ToDoItem item = new ToDoItem(shortDes.getText(),detailDes.getText(),date);
        todoitems.add(item);
        todolistview.getItems().setAll(todoitems);
        todolistview.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        shortDes.clear();
        detailDes.clear();

    }
    @FXML
    public void deleteItem()
    {
        ToDoItem item = todolistview.getSelectionModel().getSelectedItem();
        todolistview.getItems().remove(item);
        detailPage.clear();

    }

}
