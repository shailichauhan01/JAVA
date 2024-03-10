import java.util.*;
class Delimiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("apple, banana, cherry");
        scanner.useDelimiter(", ");
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
        scanner.close();
    }
}
