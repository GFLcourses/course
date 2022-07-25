package com.task.taskDTO;


import java.util.Objects;

public class DTOtaskDuoble {

    private String word = new String();
    private int id;


    public DTOtaskDuoble() {
        setWord("default");
        setId(0);

    }

    public DTOtaskDuoble(String args, Integer id) {
        this.word = args;
        this.id = id;

    }


    public String getWord() {

        return this.word;
    }

    public void setWord(String word) {

        this.word = word;
    }

    public Integer getId() {

        return this.id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DTOtaskDuoble odtask = (DTOtaskDuoble) o;
        return Objects.equals(word, odtask.word) && Objects.equals(id, odtask.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, id);
    }


}
