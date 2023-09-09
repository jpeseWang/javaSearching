
import Common.Library;
import Controller.SortProgramming;
import Model.Element;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();
        System.out.println("");
        element.setSize_array(library.getInt("Enter number of array", 1, 100));
        System.out.println("Creating array...");
        element.setArray(library.createArray(element.getSize_array()));
        int[] array = element.getArray();
        System.out.print("Your array: ");
        library.display(array);
        System.out.println("");
        new SortProgramming(element).run();
    }
}
