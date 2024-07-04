package com.example.gestionv2;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class TaskDetailActivity extends AppCompatActivity {

    private TextView tvTaskName, tvTaskDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_detail);

        tvTaskName = findViewById(R.id.tv_task_name);
        tvTaskDescription = findViewById(R.id.tv_task_description);

        // Obtener datos del Intent
        String taskName = getIntent().getStringExtra("TASK_NAME");
        String taskDescription = getIntent().getStringExtra("TASK_DESCRIPTION");

        // Mostrar los datos en las TextViews
        tvTaskName.setText("Task Name: " + taskName);
        tvTaskDescription.setText("Task Description: " + taskDescription);
    }
}
