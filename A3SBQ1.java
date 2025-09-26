package Assignment33;

  import java.util.*;

	public class A3SBQ1 {
	    public static void main(String[] args) {
	        LinkedList<String> colors = new LinkedList<>(Arrays.asList("red", "blue", "yellow", "orange"));

	        
	        System.out.println("Colors using Iterator:");
	        Iterator<String> itr = colors.iterator();
	        while (itr.hasNext()) {
	            System.out.println(itr.next());
	        }

	        
	        System.out.println("\nColors in reverse using ListIterator:");
	        ListIterator<String> listItr = colors.listIterator(colors.size());
	        while (listItr.hasPrevious()) {
	            System.out.println(listItr.previous());
	        }

	       	List<String> newColors = Arrays.asList("pink", "green");
	        int index = colors.indexOf("yellow");
	        colors.addAll(index, newColors);

	        System.out.println("\nColors after inserting pink and green:");
	        for (String color : colors) {
	            System.out.println(color);
	        }
	    }
	}