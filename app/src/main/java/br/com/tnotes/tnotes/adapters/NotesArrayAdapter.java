package br.com.tnotes.tnotes.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import br.com.tnotes.tnotes.Notes;
import br.com.tnotes.tnotes.R;

public class NotesArrayAdapter extends ArrayAdapter<Notes> {

    private LayoutInflater nLayoutInflater;
    private int nLayoutResourceId;
    private ArrayList<Notes> nData;

    LinearLayout labelColor;
    TextView noteTitle;
    TextView dateCreated;

    public NotesArrayAdapter(Context context, int resource, ArrayList<Notes> objects) {
        super(context, resource, objects);
        nLayoutInflater = LayoutInflater.from(context);
        nLayoutResourceId = resource;
        nData = objects;
    }

    @Override
    public Notes getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = nLayoutInflater.inflate(nLayoutResourceId, parent, false);

        labelColor = (LinearLayout) convertView.findViewById(R.id.label_color);
        noteTitle = (TextView) convertView.findViewById(R.id.note_title);
        dateCreated = (TextView) convertView.findViewById(R.id.date_created);

        Notes note = getItem(position);

        labelColor.setBackgroundColor(note.getLabelColor());
        noteTitle.setText(note.getTitle());
        dateCreated.setText(note.getDate());

        return convertView;
    }
}
