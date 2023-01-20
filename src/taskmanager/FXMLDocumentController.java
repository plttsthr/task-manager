/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskmanager;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;


/**
 *
 * @author paulette.
 */
public class FXMLDocumentController implements Initializable {
        
   
    public TableView<Task> table;
    
    public TableColumn<Task, String> TaskName;

    public TableColumn<Task, String> Description;

    public TableColumn<Task, String> DueDate;

    @FXML
    private TableColumn<Task, String> Status;
    
    @FXML
    private Button AddButton;

    @FXML
    private TextField TaskNameField;

    @FXML
    private DatePicker DueDatePicker;

    @FXML
    private TextArea DescriptionField;
    

    ObservableList<Task> observableList = FXCollections.observableArrayList(
        new Task(" Paulette", " ii ", "iii ")
    
    );
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        TaskName.setCellValueFactory(new PropertyValueFactory<>("Name")) ;
        Description.setCellValueFactory(new PropertyValueFactory<>("Description")) ;
        DueDate.setCellValueFactory(new PropertyValueFactory<>("DueDate")) ;
        table.setItems(observableList);
    }   
    
    @FXML
    void AddNew(ActionEvent e){
        
        Task task = new Task(TaskNameField.getText(), DescriptionField.getText(), DueDatePicker.getValue().toString()  );
        table.getItems().add(task);
        TaskNameField.setText("");
        DescriptionField.setText("");
        DueDatePicker.setValue(null);
        
    }
    
}
