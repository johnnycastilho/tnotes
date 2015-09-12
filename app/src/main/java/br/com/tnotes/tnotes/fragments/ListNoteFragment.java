package br.com.tnotes.tnotes.fragments;

import android.app.Activity;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.melnykov.fab.FloatingActionButton;

import java.util.ArrayList;

import br.com.tnotes.tnotes.Notes;
import br.com.tnotes.tnotes.R;
import br.com.tnotes.tnotes.adapters.NotesArrayAdapter;

public class ListNoteFragment extends Fragment {

    ArrayList<Notes> notes = new ArrayList<Notes>();
    NotesArrayAdapter nAdapter;
    ListView notesList;
    FloatingActionButton fab;

    public ListNoteFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_note, container, false);

        notes.add(new Notes("Título da Nota", "Criado em 06 de set de 2015", Color.parseColor("#200ff5")));
        notes.add(new Notes("Título da Nota", "Criado em 06 de set de 2015", Color.parseColor("#ea1616")));
        notes.add(new Notes("Título da Nota", "Criado em 06 de set de 2015", Color.parseColor("#6e6a6a")));
        notes.add(new Notes("Título da Nota", "Criado em 06 de set de 2015", Color.parseColor("#18a31f")));
        notes.add(new Notes("Título da Nota", "Criado em 06 de set de 2015", Color.parseColor("#dfe116")));
        notes.add(new Notes("Título da Nota", "Criado em 06 de set de 2015", Color.parseColor("#200ff5")));
        notes.add(new Notes("Título da Nota", "Criado em 06 de set de 2015", Color.parseColor("#ea1616")));
        notes.add(new Notes("Título da Nota", "Criado em 06 de set de 2015", Color.parseColor("#6e6a6a")));
        notes.add(new Notes("Título da Nota", "Criado em 06 de set de 2015", Color.parseColor("#18a31f")));
        notes.add(new Notes("Título da Nota", "Criado em 06 de set de 2015", Color.parseColor("#dfe116")));
        notes.add(new Notes("Título da Nota", "Criado em 06 de set de 2015", Color.parseColor("#200ff5")));
        notes.add(new Notes("Título da Nota", "Criado em 06 de set de 2015", Color.parseColor("#ea1616")));
        notes.add(new Notes("Título da Nota", "Criado em 06 de set de 2015", Color.parseColor("#6e6a6a")));
        notes.add(new Notes("Título da Nota", "Criado em 06 de set de 2015", Color.parseColor("#18a31f")));
        notes.add(new Notes("Título da Nota", "Criado em 06 de set de 2015", Color.parseColor("#dfe116")));

        nAdapter = new NotesArrayAdapter(getActivity().getBaseContext(), R.layout.note_item, notes);

        notesList = (ListView) view.findViewById(R.id.note_list);
        fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.attachToListView(notesList);
        notesList.setAdapter(nAdapter);

        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
