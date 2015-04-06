package com.example.martin.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Kyle on 06/04/2015.
 */
public class MenuFragment extends android.support.v4.app.Fragment {
    View rootview;
    int resource;

    public MenuFragment(){

    }

    public void fragSelect(int fragment){
        switch(fragment){
            /**Here you give the number a layout to be set for the fragment if else fails the
             * empty/error fragment will show.
             */
            case 0:
                resource = R.layout.menu1_layout;
                break;
            case 1:
                resource = R.layout.menu2_layout;
                break;
            case 2:
                resource = R.layout.menu1_layout;
                break;
            case 99:
                resource = R.layout.empty;
            default:
                resource = R.layout.empty;
                break;
        }
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(resource, container, false);
        return rootview;
    }
}
