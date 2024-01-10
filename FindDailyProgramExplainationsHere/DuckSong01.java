public class DuckSong01 {
    public static void main(String[] args) {
        int ducksNum = 5;
        String word = "ducks";

        while (ducksNum > 0) {
            if (ducksNum == 1) {
                word = "duck";
            }

            System.out.println(ducksNum + " little " + word + ", went out one day");
            System.out.println("Over the hills and far away");
            System.out.println("Mother duck said, 'Quack, quack, quack, quack'");
            ducksNum = ducksNum - 1;

            if (ducksNum > 0) {
                System.out.println("But only " + ducksNum + " little " + 
                word + " came back");
            } else {
                System.out.println("And none of the little ducks came back");
            }
            System.out.println();
        } // end while loop
    } // end main method
} // end class