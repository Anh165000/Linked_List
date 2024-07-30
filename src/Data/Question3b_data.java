package Data;

import java.util.Scanner;

public class Question3b_data {

    public int n;
    public Question3b_data linked;
    public Question3b_data linkedList[];
    public Scanner sc = new Scanner(System.in);
    public int size;

    public Question3b_data(int n) {
        this.n = n;
        linked = null;
    }

    public void input_list() {

        size = sc.nextInt();
        linkedList = new Question3b_data[size];

        for (int i = 0; i < size; i++) {
            linkedList[i] = new Question3b_data(sc.nextInt());
        }
        for (int i = size - 1; i >= 0; i--) {
            if (i < size - 1)
                linkedList[i].linked = linkedList[i + 1];
            else
                linkedList[size - 1].linked = null;
        }
    }

    public void swapI(int a, int b) {
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
    }

    public void swapL(Question3b_data a, Question3b_data b) {
        Question3b_data temp = null;
        temp = a;
        a = b;
        b = temp;
    }

    public void sort_ascending(Question3b_data linkedList[]){

        for(int i = 0; i < size - 2; i++){
            for(int j = i + 1; j < size - 1; j++){
                if(linkedList[i].n > linkedList[j].n){
                    swapL(linkedList[i].linked, linkedList[j].linked);
                    swapI(linkedList[i].n, linkedList[j].n);
                }
            }
        }

    }


    public void sort_descending(Question3b_data linkedList[]) {

        for(int i = 0; i < size - 2; i++){
            for(int j = i + 1; j < size - 1; j++){
                if(linkedList[i].n < linkedList[j].n){
                    swapL(linkedList[i].linked, linkedList[j].linked);
                    swapI(linkedList[i].n, linkedList[j].n);
                }
            }
        }
    }

}