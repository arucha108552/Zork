package io.muic.ooc.thienthai.zork;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */

class Map{

    private int levelCleared = 0;

    public Map(){

    }

    public String[] getMap(){

        String[] map1 = {

                "#########################################",
                "#C        =I                           I#",
                "#         =             M               #",
                "#         =    M                 ==DDD==#",
                "====DDD====               M      =      #",
                "#                  I             =C     #",
                "#     ###################################",
                "#S    ###################################",
                "#########################################",

        };

        return map1;
    }

}

public class startGame
{

    public static void main( String[] args )
    {
//        Map map = new Map();
//        System.out.println(map.getMap()[1].charAt(1));
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
    }
}
