interface Playable{
   void play();
}

interface Stopable{
  void stop();
}

abstract class Media{
  String title; 
  Media(String title){
    this.title = title;
  }

  void displayTitle(){
    System.out.println("Title : "+title);
  }

  abstract void info();
}

class Music extends Media implements Playable,Stopable{
  String artist;
  int duration;
  
  Music(String title,String artist,int duration)
  {
     super(title);
     this.artist = artist;
     this.duration = duration;
  }

  public void play(){
     System.out.println("Playing Music : "+title);
  }

  public void stop(){
     System.out.println("Stoping Music : "+title);
  }

  void info(){
     System.out.println("Artist : "+artist);
     System.out.println("Duration : "+duration+" seconds");
  }
}

public class MusicSystem{
  public static void main(String args[]){
     Music music = new Music("Ranjnave","Arijit" ,240);
     music.displayTitle();     
     music.info();
     music.play();
     music.stop();
  }
}


