package com.dhe.task_manager.service;

import com.dhe.task_manager.entites.TaskEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class TaskService {
    private ArrayList<TaskEntity> tasks = new ArrayList<>();
    private int taskId = 1;

    public TaskEntity addTask( String title , String description , String deadline ){
        TaskEntity task = new TaskEntity();
        task.setId(taskId);
        task.setTitle(title);
        task.setDeadline(new Date(deadline));
        task.setDescription(description);
        tasks.add(task);
        taskId++;
        return task;
    }
   public ArrayList<TaskEntity> getTasks(){
        return tasks;
    }
    public TaskEntity getTaskById(int id ){
        for (TaskEntity task: tasks){
            if(task.getId()==id){
                return task;
            }
        }
        return null;
    }

}
