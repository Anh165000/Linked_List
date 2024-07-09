package Main;

import java.util.Scanner;
import Data.Question3b_data;

public class Question3b_main {

    private static Scanner sc = new Scanner(System.in);
    private static Question3b_data linkedList[];

    public static void main(String[] args) {
        input_list();
    }

    public static void input_list(){
        
        int size = sc.nextInt();
        linkedList = new  Question3b_data[size];
        
        for(int i = 0; i < size; i++){
            linkedList[i] = new Question3b_data(sc.nextInt());
        }
        for(int i = size - 1; i >= 0; i--){
            if(i < size - 1)
                linkedList[i].linked = linkedList[i + 1];
            else
                linkedList[size - 1].linked = null;
        }
        
        // for(int i = 0; i < size; i++){
        //     System.out.printf("%d ", linkedList[i].n);
        // }

        // for(int i = 0; i < size; i++){
        //     if(linkedList[i].linked != null)
        //         System.out.println(linkedList[i].linked);
        //     else
        //         System.out.printf("%s", "null");
        // }
    }

    public static void sort_ascending(){

    }

    public static void sort_descending(){
        
    }
}
