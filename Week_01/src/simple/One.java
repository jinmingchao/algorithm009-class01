package simple;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author MingChao Jin
 * @Date 2020/5/24 19:40
 * @Description: Use addFirst() and addLast() to rewrite the code showed on video.
 */
public class One {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<String>();

        deque.addFirst("a");
        deque.addFirst("b");
        deque.addFirst("c");
        System.out.println(deque);

        String str = deque.getFirst();
        System.out.println(str);
        System.out.println(deque);

        while (deque.size() > 0) {
            System.out.println(deque.removeFirst());
        }
        System.out.println(deque);
    }

}
