import java.util.*;

public class item_2 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter list1: ");
        String[] strlist1 = input.nextLine().split(" ");
        int[] list1 = new int[strlist1.length];

        for (int i = 0; i < strlist1.length; i++) {
            try {
                list1[i] = Integer.parseInt(strlist1[i]);
            } catch (Exception e) {
                System.out.println("Error : center number or one space");
                return;
            }
        }

        for (int i = 0; i < strlist1.length; i++) {
            list1[i] = Integer.parseInt(strlist1[i]);
        }

        System.out.print("Enter list2: ");
        String[] strlist2 = input.nextLine().split(" ");
        int[] list2 = new int[strlist2.length];
        for (int i = 0; i < strlist2.length; i++) {
            list2[i] = Integer.parseInt(strlist2[i]);
        }
        int[] list3 = merge(list1, list2);
        System.out.print("The merged list is ");
        for (int i = 0; i < list3.length; i++) {
            System.out.print(list3[i] + " ");
        }
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] mergeint = new int[list1.length + list2.length];
        for (int i = 0; i < list1.length; i++) {
            mergeint[i] = list1[i];
        }
        for (int i = 0; i < list2.length; i++) {
            mergeint[i + list1.length] = list2[i];
        }
        Arrays.sort(mergeint);
        return mergeint;
    }
}