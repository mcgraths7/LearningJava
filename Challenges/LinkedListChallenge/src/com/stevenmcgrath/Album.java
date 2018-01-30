package com.stevenmcgrath;

import java.util.ArrayList;
import java.util.List;

public class Album {
  private String title;
  private SongList songList;
  
  public Album(String title) {
    this.title = title;
    this.songList = new SongList();
  }
  
  public String getTitle() {
    return title;
  }
  
  public void addSong(String title, double duration) {
    songList.addSong(title, duration);
  }
  
  public List<Song> getTracks() {
    return songList.getSongList();
  }
  
//  public boolean addSong(String title, int duration) {
//    if (findSong(title) == null) {
//      tracks.add(new Song(title, duration));
//      return true;
//    }
//    return false;
//  }
//
//  private Song findSong(String title) {
//    for (Song song:tracks) {
//      if (song.getTitle().equals(title)) {
//        return song;
//      }
//    }
//    return null;
//  }
  
  
  private class SongList {
    private List<Song> songList;
  
    private SongList() {
      this.songList = new ArrayList<Song>();
    }
    
    private Song findSong(String title) {
      for (Song song:songList) {
        if (song.getTitle().equals(title)) {
          return song;
        }
      }
      return null;
    }
    
    private void addSong(String title, double duration) {
      if (findSong(title) == null) {
        songList.add(new Song(title, duration));
      }
    }
  
    private List<Song> getSongList() {
      return songList;
    }
  }
}
