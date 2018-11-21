package com.mobileapps.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvRecyclerView = findViewById(R.id.rvRecyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this, getStudentds());
        rvRecyclerView.setLayoutManager(layoutManager);
        rvRecyclerView.setAdapter(recyclerViewAdapter);

    }

    public ArrayList<Student> getStudentds() {
        ArrayList<Student> returnList = new ArrayList<>();
        returnList.add(new Student("Bob", "A"));
        returnList.add(new Student("Ted", "B"));
        returnList.add(new Student("Jill", "C"));
        returnList.add(new Student("David", "D"));
        returnList.add(new Student("Jamie", "F"));
        returnList.add(new Student("Manroop", "F"));
        returnList.add(new Student("Luis", "D"));
        returnList.add(new Student("Dip", "C"));
        returnList.add(new Student("George", "A"));
        returnList.add(new Student("Bob", "A"));
        returnList.add(new Student("Ted", "B"));
        returnList.add(new Student("Jill", "C"));
        returnList.add(new Student("David", "D"));
        returnList.add(new Student("Jamie", "F"));
        returnList.add(new Student("Manroop", "F"));
        returnList.add(new Student("Luis", "D"));
        returnList.add(new Student("Dip", "C"));
        returnList.add(new Student("George", "A"));
        returnList.add(new Student("Bob", "A"));
        returnList.add(new Student("Ted", "B"));
        returnList.add(new Student("Jill", "C"));
        returnList.add(new Student("David", "D"));
        returnList.add(new Student("Jamie", "F"));
        returnList.add(new Student("Manroop", "F"));
        returnList.add(new Student("Luis", "D"));
        returnList.add(new Student("Dip", "C"));
        returnList.add(new Student("George", "A"));
        returnList.add(new Student("Bob", "A"));
        returnList.add(new Student("Ted", "B"));
        returnList.add(new Student("Jill", "C"));
        returnList.add(new Student("David", "D"));
        returnList.add(new Student("Jamie", "F"));
        returnList.add(new Student("Manroop", "F"));
        returnList.add(new Student("Luis", "D"));
        returnList.add(new Student("Dip", "C"));
        returnList.add(new Student("George", "A"));
        returnList.add(new Student("Bob", "A"));
        returnList.add(new Student("Ted", "B"));
        returnList.add(new Student("Jill", "C"));
        returnList.add(new Student("David", "D"));
        returnList.add(new Student("Jamie", "F"));
        returnList.add(new Student("Manroop", "F"));
        returnList.add(new Student("Luis", "D"));
        returnList.add(new Student("Dip", "C"));
        returnList.add(new Student("George", "A"));
        returnList.add(new Student("Bob", "A"));
        returnList.add(new Student("Ted", "B"));
        returnList.add(new Student("Jill", "C"));
        returnList.add(new Student("David", "D"));
        returnList.add(new Student("Jamie", "F"));
        returnList.add(new Student("Manroop", "F"));
        returnList.add(new Student("Luis", "D"));
        returnList.add(new Student("Dip", "C"));
        returnList.add(new Student("George", "A"));
        returnList.add(new Student("Bob", "A"));
        returnList.add(new Student("Ted", "B"));
        returnList.add(new Student("Jill", "C"));
        returnList.add(new Student("David", "D"));
        returnList.add(new Student("Jamie", "F"));
        returnList.add(new Student("Manroop", "F"));
        returnList.add(new Student("Luis", "D"));
        returnList.add(new Student("Dip", "C"));
        returnList.add(new Student("George", "A"));

        return returnList;
    }
}
