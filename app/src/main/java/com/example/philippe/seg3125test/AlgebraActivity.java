package com.example.philippe.seg3125test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AlgebraActivity extends Activity implements View.OnClickListener{

    Button profileButton;
    Button glossaryButton;
    Button learnButton;

    Button intro_quiz;

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebra);



        expListView = (ExpandableListView) findViewById(R.id.lvalg);
        prepareListData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);
        expListView.setAdapter(listAdapter);
        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Expanded",
                        Toast.LENGTH_SHORT).show();
            }
        });
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
                Toast.makeText(
                        getApplicationContext(),
                        listDataHeader.get(groupPosition)
                                + " : "
                                + listDataChild.get(
                                listDataHeader.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)
                        .show();
                return false;
            }
        });
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Introduction");
        listDataHeader.add("One-variable equations");
        listDataHeader.add("Two-variable equations");
        //listDataHeader.add("Functions");
        //listDataHeader.add("Linear equations");
        //listDataHeader.add("Sequences");
        //listDataHeader.add("Systems");

        // Adding child data
        List<String> introduction = new ArrayList<String>();
        introduction.add(getString(R.string.algebra_introduction));


        List<String> oVarEquations = new ArrayList<String>();
        oVarEquations.add("The Conjuring");


        List<String> twoVarEquarions = new ArrayList<String>();
        twoVarEquarions.add("2 Guns");


        listDataChild.put(listDataHeader.get(0), introduction); // Header, Child data
        listDataChild.put(listDataHeader.get(1), oVarEquations);
        listDataChild.put(listDataHeader.get(2), twoVarEquarions);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

        }
    }
}
