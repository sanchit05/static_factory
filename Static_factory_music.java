public class Static_factory_music {
    public music getInstance(String str){
        if(str.equals("rock")){
            return new rock();
        }
        else if(str.equals("romantic")){
            return new romantic();
        }
        else{
            return new country_music();
        }
    }
}
