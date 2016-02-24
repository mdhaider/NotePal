package com.ennjapps.notepal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.DialogFragment;
import android.view.View;

public class delete extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final CharSequence[] AddOptions = {"Note", "Quick Note", "To-Do List"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setSingleChoiceItems(AddOptions,-1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {
                switch(item)
                {
                    case 0:
                        Intent qnote= new Intent(delete.this,QuickNote.class);
                        startActivity(qnote);

                        break;
                    case 1:
                        Intent note= new Intent(delete.this,Note.class);
                        startActivity(note);
                        break;

                    case 2:
                        Intent todonote= new Intent(delete.this,TodoActivity.class);
                        startActivity(todonote);

                        break;

                }
                dialog.dismiss();

            }
        });

        Dialog dialog = builder.create();
        dialog.show();
    }

}


