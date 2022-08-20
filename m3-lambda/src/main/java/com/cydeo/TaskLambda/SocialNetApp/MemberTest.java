package com.cydeo.TaskLambda.SocialNetApp;

import java.util.ArrayList;
import java.util.List;

public class MemberTest {
    public static void main(String[] args) {
        Person p1=new Person("Mera", 45,Gender.MALE,"mera");
        Person p2=new Person("Meja", 20,Gender.MALE,"mera");
        Person p3=new Person("Mnna", 23,Gender.MALE,"mera");
        Person p4=new Person("Mjha", 17,Gender.MALE,"mera");
        List<Person> personList=new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
//you can do this Arrays.aslist(p1,p2,p3,p4)
       print(personList,p -> p.getGender()==Gender.MALE && p.getAge()>=18&& p.getAge()<=25);       ;
        /*CheckMember m1=(person)->{
            if(person.getAge()>18 && person.getAge()<=25&& person.getGender()==Gender.MALE){
            return true;
            }else{
             return false;
            }
*/
       // };
        
        //print(personList,m1)  ;
        
        
    }

    private static  void print(List<Person > personList, CheckMember checkMember){
        List<Person> result=new ArrayList<>();
        for (Person person : personList) {

            if(checkMember.test(person)){
                result.add(person);
            }
            
        }
        System.out.println(result);
    }
}
