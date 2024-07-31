package Main;

import Data.Question3b_data;

public class Question3b_main {

    private static Question3b_data a = new Question3b_data(0);
    private static Question3b_data listA[];

    public static void main(String[] args) {
        a.input_list();
        listA = a.linkedList;
        a.sort_ascending(listA);
        outputList();
        System.out.println("\n");
        a.sort_descending(listA);
        outputList();
    }

    public static void outputList() {
        for (int i = 0; i < a.size; i++) {
            System.out.printf("n:%d ", listA[i].n);
            System.out.printf("p:%s ", listA[i].linked);
            
        }
    }

}
