package com.scoctail.vocabularyapp.beans;

/**
 * Created by Kaisu on 27/3/17.
 */

public class Word {
    int id;
    String name;
    String translation;
    String examples;
    String conjugation;

    public Word(String name, String translation) {
        this.name = name;
        this.translation = translation;
    }

    public Word(String name, String translation, String examples, String conjugation) {
        this.name = name;
        this.translation = translation;
        this.examples = examples;
        this.conjugation = conjugation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getExamples() {
        return examples;
    }

    public void setExamples(String examples) {
        this.examples = examples;
    }

    public String getConjugation() {
        return conjugation;
    }

    public void setConjugation(String conjugation) {
        this.conjugation = conjugation;
    }
}