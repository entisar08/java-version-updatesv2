package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class Team<T> {//T means team is accepting certain type , it can be b f s

    private  String name ;
    private List<T>  members=new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println( ((Player)player).getName() + "is already in the team");

        return false;
        }else{
           members.add(player) ;
            System.out.println(  ((Player)player).getName()+ " is added to the team "+ getName());

            return true;
        }


    }





}
