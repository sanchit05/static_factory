import java.util.Scanner;

public class factory_main {
    public static void main(String args[]){
        System.out.println("enter song_type of your choice:  ");
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        Static_factory_music static_factory_music=new Static_factory_music();
        music m= static_factory_music.getInstance(s);
        m.song_type();


    }
}
