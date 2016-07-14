package com.codepath.example.customadapterdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomUsersAdapter extends ArrayAdapter<User> {
    public CustomUsersAdapter(Context context, ArrayList<User> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
            viewHolder = new ViewHolder();

            // Lookup view for data population
            viewHolder.tvName = (TextView) convertView.findViewById(R.id.tvName);
            viewHolder.tvHome = (TextView) convertView.findViewById(R.id.tvHometown);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = ((ViewHolder) convertView.getTag());
        }

        // Get the data item for this position
        User user = getItem(position);

        // Populate the data into the template view using the data object
        viewHolder.tvName.setText(user.name);
        viewHolder.tvHome.setText(user.hometown);

        // Return the completed view to render on screen
        return convertView;
    }
}
