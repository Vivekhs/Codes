/**
 * 
 */
package tree;

/**
 * @author vivekhs
 *
 */
import java.util.Iterator;
import java.util.LinkedList; 
public class Hack2 { 
    public static void main(String a[]){         
        LinkedList<String> list = new LinkedList<String>();
        list.add("Val 1");
        list.add("Val 2");
        list.add("Val 3");
        list.add("Random");
        Iterator<String> itr = list.descendingIterator();
        while(itr.hasNext()){
            System.out.print(" "+itr.next());
        }
    }
}
