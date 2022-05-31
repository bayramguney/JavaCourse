package day20;

public class FindDog {
    public static void main(String[] args) {
        // given sentence , find out the location of the dog

        // our approach is
        // doing through the sentence 3 character at a time
        // then if 3 characters happen to be a dog , we print out the index

    /*
      0123456789012345678901234567890123456789012345
    * I like Dog , Dogs are cute , Dogs are friendly
    * I l
    *  li
    * lik
    *
    *
    * */


        String msg = "I like Dog , Dogs are cute , Dogs are friendly";

        for (int x = 0; x <= msg.length()-3; x++) {

            String current3chars = msg.substring(x, x + 3);

            //System.out.println(x + " :  " +  current3chars   );

            if (current3chars.equals("Dog")) {
                System.out.println("BINGO !!!! AT " + x);
            }


        }
    }
}
