package com.example.angela.backlogactivity; /**
 * Created by Daniel on 31.03.2018.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class TasksAdapter extends RecyclerView.Adapter<TasksAdapter.TaskViewHolder>{

    private List<Task> tasksList;

    public TasksAdapter(List<Task> projectList) {
        this.tasksList = projectList;
    }

    @Override
    public TaskViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.tasks_list_row, parent, false);

        return new TaskViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(TaskViewHolder holder, int position) {
        holder.name.setText(tasksList.get(position).getName());
        holder.weight.setText("Weight: "+tasksList.get(position).getWeight());
        holder.time.setText("Time: "+tasksList.get(position).getTime());
        holder.position = position;
    }

    @Override
    public int getItemCount() {
        return tasksList.size();
    }

    public class TaskViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public TextView weight;
        public TextView time;
        public int position;

        public TaskViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.task_row_story);
            weight = (TextView) view.findViewById(R.id.task_row_weight);
            time = (TextView) view.findViewById(R.id.task_row_time);
        }

    }
}