package util;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// java.util.List
// 1. ArrayList
// 2. LinkedList(연결리스트)
// 3. Stack : FILO 구조, LIFO 구조
// 수식계산, 수식괄호검사, undo / redo에 주로 이용, 웹 브라우저의 뒤로 / 앞으로
// 4. Queue : FIFO 구조
// 최근사용문서, 인쇄작업 대기목록, 버퍼
public class StackEx1 {

  public static void main(String[] args) {
    Stack<String> stack = new Stack();
    Queue<String> queue = new LinkedList();
    // Stack : push() / pop()
    stack.push("A");
    stack.push("B");
    stack.push("C");
    stack.push("D");
    stack.push("E");

    while (!stack.isEmpty()) {
      System.out.println(stack.pop());
      // 나오는 순서 : E D C B A
      // First In Last Out
    }

    // Queue : offer() / poll()
    queue.offer("a");
    queue.offer("b");
    queue.offer("c");
    queue.offer("d");
    queue.offer("e");

    while (!queue.isEmpty()) {
      System.out.println(queue.poll());
      // 나오는 순서 : a b c d e
      // First In First Out
    }
  }
}
