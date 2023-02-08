package air.sebastian.nowak.pl;

import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        game();
    }
    public static void game(){

        for(int i=1; i <101; i++){
                if(i % 15 == 0){
                    System.out.println(color.ANSI_CYAN+ "FizzBuzz");
                }
                else if(i % 3 == 0){
                    System.out.println(color.ANSI_GREEN+"Fizz");
                }
                else if(i % 5 == 0){
                    System.out.println(color.ANSI_YELLOW+"Buzz");
                }
                else {
                    System.out.println(color.ANSI_RED+i);
                }
            }
    }
}