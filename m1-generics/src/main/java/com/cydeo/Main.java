package com.cydeo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        //items.add("Apple");

        printDoubled(items);


        System.out.println("------------------------------------------------------");
         FootballPlayer joe= new FootballPlayer("Joe");
         BaseballPlayer pat=new BaseballPlayer("Pat");
         SoccerPlayer beckham=new SoccerPlayer("Beckham");


         //let us create a team
         Team<SoccerPlayer> liverpool=new Team("Liverpool");// team is accepting any player instead of
        // liverpool.addPlayer(joe);
        //
        //
        // liverpool.addPlayer(pat);
         liverpool.addPlayer(beckham);
        System.out.println(liverpool);
         //







    }

    private static void printDoubled(ArrayList items) {

        for(Object i:items){

            System.out.println(( (Integer)i * 2));
        }


    }

}
