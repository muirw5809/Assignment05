/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muirw5809
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           OrderedList list = new OrderedList();
           list.add(new Node(10));
           list.add(new Node(8));
           list.add(new Node(6));
           list.add(new Node(4));
           list.printList();
           System.out.println("");
           list.add(new Node(9));
        
           
           list.printList();
           
    
        
    }
}