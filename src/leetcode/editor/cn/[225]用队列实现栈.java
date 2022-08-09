/**
 * <p>请你仅使用两个队列实现一个后入先出（LIFO）的栈，并支持普通栈的全部四种操作（<code>push</code>、<code>top</code>、<code>pop</code> 和 <code>empty</code>）。</p>
 *
 * <p>实现 <code>MyStack</code> 类：</p>
 *
 * <ul>
 * <li><code>void push(int x)</code> 将元素 x 压入栈顶。</li>
 * <li><code>int pop()</code> 移除并返回栈顶元素。</li>
 * <li><code>int top()</code> 返回栈顶元素。</li>
 * <li><code>boolean empty()</code> 如果栈是空的，返回 <code>true</code> ；否则，返回 <code>false</code> 。</li>
 * </ul>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>注意：</strong></p>
 *
 * <ul>
 * <li>你只能使用队列的基本操作 —— 也就是&nbsp;<code>push to back</code>、<code>peek/pop from front</code>、<code>size</code> 和&nbsp;<code>is empty</code>&nbsp;这些操作。</li>
 * <li>你所使用的语言也许不支持队列。&nbsp;你可以使用 list （列表）或者 deque（双端队列）来模拟一个队列&nbsp;, 只要是标准的队列操作即可。</li>
 * </ul>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>
 * ["MyStack", "push", "push", "top", "pop", "empty"]
 * [[], [1], [2], [], [], []]
 * <strong>输出：</strong>
 * [null, null, null, 2, 2, false]
 *
 * <strong>解释：</strong>
 * MyStack myStack = new MyStack();
 * myStack.push(1);
 * myStack.push(2);
 * myStack.top(); // 返回 2
 * myStack.pop(); // 返回 2
 * myStack.empty(); // 返回 False
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * <li><code>1 &lt;= x &lt;= 9</code></li>
 * <li>最多调用<code>100</code> 次 <code>push</code>、<code>pop</code>、<code>top</code> 和 <code>empty</code></li>
 * <li>每次调用 <code>pop</code> 和 <code>top</code> 都保证栈不为空</li>
 * </ul>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>进阶：</strong>你能否仅用一个队列来实现栈。</p>
 * <div><div>Related Topics</div><div><li>栈</li><li>设计</li><li>队列</li></div></div><br><div><li>👍 508</li><li>👎 0</li></div>
 */

package leetcode.editor.cn;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 用队列实现栈
 *
 * @author MC
 * @date 2022-05-13 22:09:55
 */
class P225_ImplementStackUsingQueues {
    public static void main(String[] args) {
        //测试代码

    }

    //力扣代码
//leetcode submit region begin(Prohibit modification and deletion)
    class MyStack {
        Deque<Integer> queue1;
        Deque<Integer> queue2;

        public MyStack() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();

        }

        public void push(int x) {
            queue1.addLast(x);

        }

        public int pop() {
            return queue1.pollLast();
        }

        public int top() {
            return queue1.peekLast();

        }

        public boolean empty() {
            if(queue1.isEmpty()){
                return true;
            }
            return false;

        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)

}
