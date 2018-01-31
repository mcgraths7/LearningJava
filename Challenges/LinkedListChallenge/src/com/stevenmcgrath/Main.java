package com.stevenmcgrath;

import java.lang.reflect.Array;
import java.util.*;

// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()

public class Main {
  public static LinkedList<Song> playlist = new LinkedList<Song>();
  private static ArrayList<Album> albums = new ArrayList<Album>();
  public static void main(String[] args) {
    
    Album cats = new Album("Cats");
    Album dogs = new Album("Dogs");
    Album catsAndDogs = new Album("Cats and Dogs");

    albums.add(cats);
    albums.add(dogs);
    albums.add(catsAndDogs);

    cats.addSong("Sinatra the Cat", 120);
    cats.addSong("Gustav the Cat", 225);
    cats.addSong("Sinatra and Gustav", 196);

    dogs.addSong("Kitty is a Puppy", 184);
    dogs.addSong("Blue", 203);
    dogs.addSong("Kumo in Kars", 233);

    catsAndDogs.addSong("Cats are Better than Dogs", 389);
    catsAndDogs.addSong("The Cat Smacked my Dog", 177);
    catsAndDogs.addSong("Cats sleep, Dogs Weep", 199);

    addSongToPlaylist("Sinatra the Cat", "Cats", playlist);
    addSongToPlaylist("Sinatra and Gustav", "Cats", playlist);
    addSongToPlaylist("Kitty is a Puppy", "Dogs", playlist);
    addSongToPlaylist("Blue", "Dogs", playlist);
    addSongToPlaylist("The Cat Smacked my Dog", "Cats and Dogs", playlist);
    addSongToPlaylist("Cats are Better than Dogs", "Cats and Dogs", playlist);
    addSongToPlaylist("Cats are worse than dogs", "Cats and Dogs", playlist);
  
    controlPlaylist(playlist);

  }
  
  private static void addSongToPlaylist(String songTitle, String albumTitle, LinkedList<Song> songLinkedList) {
    if (findSong(songTitle, albumTitle) != null) {
      playlist.add(findSong(songTitle, albumTitle));
    } else {
      System.out.println("Song is not in library");
    }
  }
  
  private static void controlPlaylist(LinkedList<Song> songLinkedList) {
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    boolean goingForward = true;
    ListIterator<Song> listIterator = songLinkedList.listIterator();
    
    if (songLinkedList.isEmpty()) {
      System.out.println("No songs in playlist.");
      return;
    } else {
      System.out.println("Now Playing " + listIterator.next().getTitle());
      printInstructions();
    }
    
    while (!quit) {
      int action = scanner.nextInt();
      scanner.nextLine();
      switch (action) {
        case 0:
          System.out.println("Playlist is over.");
          quit = true;
          break;
        case 1:
          if (!goingForward) {
            if (listIterator.hasNext()) {
              listIterator.next();
            }
            goingForward = true;
          }
          if (listIterator.hasNext()) {
            System.out.println("Now playing " + listIterator.next().getTitle());
          } else {
            System.out.println("Reached the end of the playlist");
            goingForward  = false;
          }
          break;
        case 2:
          if (goingForward) {
            if (listIterator.hasPrevious()) {
              listIterator.previous();
            }
            goingForward = false;
          }
            if (listIterator.hasPrevious()) {
              System.out.println("Now playing " + listIterator.previous().getTitle());
            } else {
            System.out.println("We are at the start of the playlist");
            goingForward = true;
          }
          break;
        case 3:
          System.out.println("Current Playlist:");
          for (int i = 0; i < songLinkedList.toArray().length; i++) {
            System.out.println("Title: " +  songLinkedList.get(i).getTitle());
          }
          break;
        case 4:
          System.out.println("Repeating current track.");
          if (listIterator.hasPrevious()) {
            if (goingForward) {
              listIterator.previous();
              System.out.println("Now playing " + listIterator.next().getTitle());
            } else {
              System.out.println("Now Playing " + listIterator.next().getTitle());
              listIterator.previous();
            }

          } else {
            listIterator.next();
            System.out.println("Now playing " + listIterator.next().getTitle());
            goingForward = true;
          }
          break;
        case 5:
          if (!listIterator.hasPrevious()) {
            System.out.println(listIterator.next().getTitle() + " removed from playlist");
            listIterator.remove();
          } else if (!listIterator.hasNext()) {
            System.out.println(listIterator.previous().getTitle() + " removed from playlist");
            listIterator.remove();
          } else {
            if (goingForward) {
              System.out.println(listIterator.previous().getTitle() + " has been removed.");
              listIterator.remove();
            } else {
              System.out.println(listIterator.next().getTitle() + " has been removed");
              listIterator.remove();
            }

          }
          break;
        case 6:
          printInstructions();
          break;
      }
    }
  }
  
  private static void printInstructions() {
    System.out.println("Available options:\n 0. Quit playlist\n 1. " +
                      "Skip track\n 2. Previous track\n 3. Display current playlist\n " +
                      "4. Repeat current track\n 5. Remove song\n 6. Print instructions");
  }
  private static Song findSong(String songTitle, String albumTitle) {
    for (Album album:albums) {
      if (album.getTitle().equals(albumTitle)) {
        for (Song song:album.getTracks()) {
          if (song.getTitle().equals(songTitle)) {
            return song;
          }
        }
      }
    }
    return null;
  }
  
}
