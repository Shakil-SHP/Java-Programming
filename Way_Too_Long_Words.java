import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        n = Integer.parseInt(scan.nextLine());
        String words[]=new String[n];

        for(int i=0;i<n;i++){
            words[i] = scan.nextLine();
        }

        for(int i = 0;i<n;i++){
            StringBuilder str = new StringBuilder();
            int len = words[i].length();
            if(len > 10){

                str.append(words[i].charAt(0)).append(len - 2).append(words[i].charAt(len-1));
                System.out.println(str);
            }else {
                System.out.println(words[i]);
            }
        }
    }
}
