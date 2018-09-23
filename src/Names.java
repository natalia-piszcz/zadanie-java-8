import java.util.Arrays;

//Napisz program, w którym stworzysz tablicę 3 imion, wyświetl je na ekranie.

public class Names {
    public static void main(String[] args) {
        String [] names = new String[3];
        names [0] = "Natalia";
        names [1] = "Kacper";
        names [2] = "Karol";

        String showNames = Arrays.toString(names);
        System.out.println(showNames);

    }

}
