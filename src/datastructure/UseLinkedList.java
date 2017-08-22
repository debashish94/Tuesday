package datastructure;

import java.util.LinkedList;
import java.util.Scanner;

public class UseLinkedList {

    public static void main(String[] args) {

        LinkedList<String> listOfSkills = new LinkedList<>();

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your number of skills: ");

        int numOfSkills = input.nextInt();

        Scanner sc = new Scanner(System.in);

        int count = 1;
        for(int i=0; i<numOfSkills; i++){
            System.out.println("Please enter skill #" + count);
            String skillName = sc.nextLine();
            count++;
            listOfSkills.add(skillName);
        }

        System.out.println("________________________________");

        for(String skill: listOfSkills){
            System.out.println(skill);
        }

    }

}
