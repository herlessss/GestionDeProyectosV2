package com.example.gestionv2;



import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class TaskFragment extends Fragment {

    private EditText etTaskName, etTaskDescription;
    private Button btnAssignTask;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_task_fragment, container, false);

        etTaskName = view.findViewById(R.id.et_task_name);
        etTaskDescription = view.findViewById(R.id.et_task_description);
        btnAssignTask = view.findViewById(R.id.btn_assign_task);

        btnAssignTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendTaskData();
            }
        });

        return view;
    }

    private void sendTaskData() {
        String taskName = etTaskName.getText().toString();
        String taskDescription = etTaskDescription.getText().toString();

        Intent intent = new Intent(getActivity(), TaskDetailActivity.class);
        intent.putExtra("TASK_NAME", taskName);
        intent.putExtra("TASK_DESCRIPTION", taskDescription);
        startActivity(intent);
    }
}
