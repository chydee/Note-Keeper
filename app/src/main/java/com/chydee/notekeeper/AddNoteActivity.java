package com.chydee.notekeeper;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.EditText;
import android.widget.NumberPicker;

import androidx.appcompat.app.AppCompatActivity;

public class AddNoteActivity extends AppCompatActivity {

    private EditText mEditTextTitle;
    private EditText mEditTextDescription;
    private NumberPicker mNumberPickerPriority;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        mEditTextTitle = findViewById(R.id.edit_text_title);
        mEditTextDescription = findViewById(R.id.edit_text_description);
        mNumberPickerPriority = findViewById(R.id.number_picker_priority);

        mNumberPickerPriority.setMinValue(1);
        mNumberPickerPriority.setMaxValue(10);

        //In order to get the little 'x' in the top left corner of the action bar
        //i.e the close o exit activity button,
        // We call :
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_close);
        setTitle("Add Note");// This will just display the "Add Note" text in the action bar
    }

    //So to comfirm the inputs when we click the save icon in the top menu right corner of the action bar
    //First of all we have to get this icon there. We do this by overwriting :

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.add_note_menu, menu);
        return true;// Which means that we want to display the menu
    }
}
