package com.msb.learn.jukeboxDesign;

import javafx.util.Pair;

import java.util.*;

interface CollectionLib {
    void sort();

    void add(CollectionLib collectionLib);

    void update(CollectionLib oldObject, CollectionLib newObject);

    void delete(CollectionLib object);

    boolean find(CollectionLib lib);

    List<CollectionLib> display();
}

class Entity {
    int id;
    String name;

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
}

class Library extends Entity implements CollectionLib {

    List<Album> list = null;

    @Override
    public void sort() {

    }

    @Override
    public void add(CollectionLib collectionLib) {

    }

    @Override
    public void update(CollectionLib oldObject, CollectionLib newObject) {

    }

    @Override
    public void delete(CollectionLib object) {

    }

    @Override
    public boolean find(CollectionLib lib) {
        return false;
    }

    @Override
    public List<CollectionLib> display() {
        return null;
    }

}

class Album extends Entity implements CollectionLib {

    @Override
    public void sort() {

    }

    @Override
    public void add(CollectionLib collectionLib) {

    }

    @Override
    public void update(CollectionLib oldObject, CollectionLib newObject) {

    }

    @Override
    public void delete(CollectionLib object) {

    }

    @Override
    public boolean find(CollectionLib lib) {
        return false;
    }

    @Override
    public List<CollectionLib> display() {
        return null;
    }

}

class Song extends Entity {
    Boolean isBeingPlayed = false;

    Boolean playSong() {
        return null;
    }
}

class Astronout extends Entity {
    int priority;
    void descreasePriority() {
        priority--;
    }
    void increasePriority() {
        priority++;
    }
}

class JukeBox {
    PriorityQueue<Pair<Song, Astronout>> queue = new PriorityQueue<>(new Comparator<Pair<Song, Astronout>>() {
        @Override
        public int compare(Pair<Song, Astronout> o1, Pair<Song, Astronout> o2) {
            return o1.getValue().priority - o2.getValue().priority;
        }
    });

    void addSong(Song song, Astronout astronout) {
        if (!song.isBeingPlayed) {
            queue.add(new Pair<Song, Astronout>(song, astronout));
        }
    }

    void removeSong(Song song) {
    }



}

 class System{
    public static void main(String args[]){
        Song song = new Song();
        Album album = new Album();
        Library library = new Library();
        library.find(album);

    }
}




