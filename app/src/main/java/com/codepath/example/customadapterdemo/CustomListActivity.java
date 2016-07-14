package com.codepath.example.customadapterdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomListActivity extends Activity {

    private ListView listView;
    private ArrayList<User> arrayOfUsers;
    private CustomUsersAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        listView = (ListView) findViewById(R.id.lvUsers);

        populateUsersList();

        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position,
                                    long arg3) {
                User user =  (User) adapter.getItemAtPosition(position);
                deleteUser(position);
                // assuming string and if you want to get the value on click of list item
                // do what you intend to do on click of listview row
            }
        });
    }

    private void populateUsersList() {
        // Construct the data source
        arrayOfUsers = User.getUsers();
        // Create the adapter to convert the array to views
        adapter = new CustomUsersAdapter(this, arrayOfUsers);
        // Attach the adapter to a ListView
        listView.setAdapter(adapter);
    }

    private void  deleteUser(int position) {
        arrayOfUsers.remove(position);
        adapter.notifyDataSetChanged();
    }
}
