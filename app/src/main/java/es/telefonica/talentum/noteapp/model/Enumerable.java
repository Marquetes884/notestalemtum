package es.telefonica.talentum.noteapp.model;


import java.util.List;

public interface Enumerable<t> {
    int count();
    void  add(t element);
    void remove (int index);
    void update (int index, Note newElement);
    List<Note> getAll();
}
