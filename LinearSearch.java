import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int len;
        System.out.println("Enter size of the array : ");
        len = scan.nextInt();
        int[] intergerArray = new int[len];

        System.out.println("Enter "+ len + " interger numbers :");
        for (int i = 0; i < len; i++) {
            intergerArray[i] = scan.nextInt();
        }

        int searchValue , result;
        System.out.println("Enter the value you want to search : ");
        searchValue = scan.nextInt();
        result = search(intergerArray,searchValue);

        if (result == -1){
            System.out.println(searchValue + " not found in the array.");
        }else {
            System.out.println(searchValue + " is found in index : " + result);
        }
    }

    private static int search(int arra[],int value) {

        for (int i = 0; i < arra.length; i++) {
            if(arra[i] == value)
                return i;
        }
        return -1;
    }
}
