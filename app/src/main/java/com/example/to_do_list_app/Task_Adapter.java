package com.example.to_do_list_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Task_Adapter extends ArrayAdapter<String> {
    private final Context context;
    private final ArrayList<String>taskList;

    public Task_Adapter(Context context,ArrayList<String> taskList) {
super(context,0,taskList);
this.context=context;
this.taskList=taskList;
    }


    public View getView(int position, ViewGroup parent) {
        String task = taskList.get(position);

        View convertView = LayoutInflater.from(context).inflate(R.layout.activity_task_adapter, parent, false);
        TextView textViewTask = convertView.findViewById(R.id.textViewTask);
        textViewTask.setText(task);

        return convertView;
    }

    public void notifyDatasetChanged() {
    }
}
