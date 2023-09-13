package com.example.to_do_list_app;


import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity
{
    private final EditText editTextTask = findViewById(R.id.editTextTask);
    private Button buttonAdd;
    private ListView listViewTasks;
    private ArrayList<String> taskList;
    private Task_Adapter taskAdapter;
    private Object v;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAdd=findViewById(R.id.buttonAdd);
        listViewTasks=findViewById(R.id.listViewTasks);
        taskList=new ArrayList<>();
        taskAdapter=new Task_Adapter(this,taskList);
        listViewTasks.setAdapter(taskAdapter);
        buttonAdd.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        {
        View v;
        {
            String task=editTextTask.getText().toString().trim();
            if(!task.isEmpty())
            {
                taskList.add(task);
                taskAdapter.notifyDatasetChanged();
                editTextTask.setText("");
                Toast.makeText(MainActivity.this, "Task added", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(MainActivity.this, "Please enter a task",Toast.LENGTH_SHORT).show();

            }
        }
    }
    }
}
