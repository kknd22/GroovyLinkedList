package me
import java.util.LinkedList
/**
 * Created with IntelliJ IDEA.
 * User: u1cc32
 * Date: 8/21/13
 * Time: 8:54 AM
 * To change this template use File | Settings | File Templates.
 */



public class LinkedListReversion {
    static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> o ) {
        if (o.size == 0 || o.size == 1) return o

        Integer head = o.removeFirst()
//        println("head --->" + head)

        LinkedList<Integer> mod = reverseLinkedList(o)

        mod.add(head)
//        println("mod --->" + mod)
        mod

    }

    static void main(args) {
        LinkedList<Integer> original = new LinkedList<Integer>()

        def i=0
        (0..20).each {original.add(++i)}

        println(original)

        LinkedList<Integer> reversed = reverseLinkedList(original)

        println(reversed)

    }
}
