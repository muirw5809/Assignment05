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
//           OrderedList list = new OrderedList();
//           list.add(new Node(7));
//           list.add(new Node(2));
//           list.add(new Node(2));
//           list.add(new Node(10));
//           list.add(new Node(8));
//           list.add(new Node(3));          
//           list.printList();
//           System.out.println("");
//           list.remove(2);
//           list.printList();

//           ArrayList list = new ArrayList(10);
//           list.add(0, 5);
//           list.add(10, 20);
//           list.printList();
        
        StackList list = new StackList();
        list.push(new StringNode('c'));
        list.push(new StringNode('a'));
        list.push(new StringNode('t'));
        list.push(new StringNode('$'));
        list.push(new StringNode('t'));
        list.push(new StringNode('a'));
        list.push(new StringNode('c'));
        list.print();
        System.out.println("the number of items in the list is: " + list.size());
        list.isTrue(list);

    }
}
