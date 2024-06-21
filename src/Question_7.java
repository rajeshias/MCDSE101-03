public class Question_7 {

    public static void main(String args[]) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if (a > b) {
            int c = b;
            b = a;
            a = c;
        }

        //add code below this line
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(sum);
        //add code above this line
    }

}
