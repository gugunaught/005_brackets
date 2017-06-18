import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s;
        System.out.print("Type your expression:");
        Scanner scan = new Scanner(System.in);
        s = scan.nextLine();

        int b = 0; //count brackets
        int l = s.indexOf('('); //position of the left bracket
        int r = s.indexOf(')'); //position of the right bracket

//        if (l>r)
//            break;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                b++;
            else if (s.charAt(i) == ')')
                b--;
        }

        if (b != 0 || l > r)
            System.out.println("Error!");
        else
            System.out.println("OK!");
    }

}
