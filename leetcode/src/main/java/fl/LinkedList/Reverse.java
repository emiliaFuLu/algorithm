package fl.LinkedList;

/**
 * Reverse
 *
 * @author fulu
 * {@code @date} 2022/7/19 10:45
 * {@code @description} 翻转链表
 */
public class Reverse {

    public static void main(String[] args) {
        Node<Integer> node = new Node<>(1, new Node<>(2, new Node<>(3, null)));
        Node<Integer> reverse = reverse(node);
        while (reverse != null) {
            System.out.println(reverse.data);
            reverse = reverse.next;
        }
    }

    public static Node<Integer> reverse(Node<Integer> p) {
        Node<Integer> head = new Node<>(999, null);
        head.next = p;

        Node<Integer> current = p.next;
        p.next = null;
        Node<Integer> next;

        while (current != null) {
            // 主节点
            next = current.next;

            current.next = head.next;
            head.next = current;
            System.out.println(head);

            current = next;
        }

        return head;
    }

}
 