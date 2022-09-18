package Array_list;

import java.util.*;

public class operations_on_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(5);
        al.add(69);
        int element = sc.nextInt();
        int position = sc.nextInt();
        for (int i = position; i <= al.size(); i++) {
            int temp = al.get(position);
            al.add(position, element);
            element = temp;
        }
    }
}
