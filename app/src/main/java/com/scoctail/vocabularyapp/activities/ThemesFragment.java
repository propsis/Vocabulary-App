package com.scoctail.vocabularyapp.activities;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.scoctail.vocabularyapp.R;
import com.scoctail.vocabularyapp.adapters.ThemeAdapter;
import com.scoctail.vocabularyapp.backgroundtasks.AddThemeBackgroundTask;
import com.scoctail.vocabularyapp.backgroundtasks.ShowThemesBackgroundTask;

/**
 * Created by Kaisu on 1.8.2017.
 */

public class ThemesFragment extends Fragment
{
    View view;
    ListView lv;
    ThemeAdapter adapter;
    private EditText et_name;
    private String name;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.themes_list, container,false);

        adapter = new ThemeAdapter(getContext(), R.layout.theme_row);
        lv = (ListView)view.findViewById(R.id.languages_listview);
        lv.setAdapter(adapter);
        ShowThemesBackgroundTask bg = new ShowThemesBackgroundTask(this.getContext(), adapter);
        bg.execute("showThemes");


        ImageButton btn = (ImageButton)view.findViewById(R.id.add_new_theme_btn);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                et_name = (EditText)view.findViewById(R.id.new_language_name);
                saveNewTheme(v);
                et_name.setText("");
            }
        });

        return view;
    }


    public void saveNewTheme(View v) {
        name = et_name.getText().toString().trim();

        if(name.isEmpty()) {
            Toast.makeText(this.getContext(), "Please fill out theme name!", Toast.LENGTH_SHORT).show();
        } else {
            AddThemeBackgroundTask bg = new AddThemeBackgroundTask(this.getContext(),adapter);
            bg.execute("addTheme", name);

        }


    }

}
