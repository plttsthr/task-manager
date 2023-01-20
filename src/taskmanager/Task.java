
package taskmanager;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.TreeTableColumn;

/**
 *
 * @author paulette.
 */
public class Task {
    
    private SimpleStringProperty TaskName;
    private SimpleStringProperty TaskDescription;
    private SimpleStringProperty TaskDueDate;
    
    public Task(String Name, String Description, String DueDate){
        
        this.TaskName = new SimpleStringProperty(Name);
        this.TaskDueDate = new SimpleStringProperty(DueDate);
        this.TaskDescription = new SimpleStringProperty(Description);
        
    }

    
    public String getName(){
        return TaskName.get();
    }
    
    public String getDescription(){
        return TaskDescription.get();
    }
    
    public String getDueDate(){
        return TaskDueDate.get();
    }
    
    public void setName(String Name){
        this.TaskName = new SimpleStringProperty(Name);
    }
    
    public void setDescription(String Description){
        this.TaskDescription = new SimpleStringProperty(Description);
    }
    
    public void setDueDate(String DueDate){
        this.TaskDueDate =  new SimpleStringProperty(DueDate);;
    }
}

