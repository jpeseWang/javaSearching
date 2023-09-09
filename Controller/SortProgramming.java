package Controller;

import Common.Algorithm;
import Common.Library;
import Model.Element;
import View.Menu;

public class SortProgramming extends Menu<String> {

    static String[] mc = { "Search", "Exit" };

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public SortProgramming(Element element) {
        super("SEARCH PROGRAM", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = element.getSize_array();
        array = element.getArray();

    }

    public void execute(int n) {
        switch (n) {
            case 1:
                search();
                break;
            case 2:
                System.exit(0);

        }
    }

    public void search() {
        final String[] mcSearch = { "Linear Search", "Binary Search", "Exit" };
        class SearchMenu extends Menu<String> {
            public SearchMenu() {
                super("Search Option", mcSearch);
            }

            @Override
            public synchronized void execute(int n) {
                library.display(array);
                int value = library.getInt("\nEnter number to find: ", 1, 100);
                switch (n) {
                    case 1:
                        System.out.println(
                                "Found value: " + value + " at index: " + algorithm.linearSearch(array, value));
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println(
                                "Found value: " + value + " at index: " + algorithm.binarySearch(array, value));
                        System.out.println("");
                        break;
                    case 3:
                        System.exit(0);
                        break;
                }
            }
        }
        SearchMenu sm = new SearchMenu();
        sm.run();
    }
}
