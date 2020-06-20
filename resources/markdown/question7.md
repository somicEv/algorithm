# 【面试题7】使用两个栈模拟队列

### 1、思路

用其中一个栈做入队操作，另一个栈做出队操作。这样做的原因是栈只能从栈顶弹出元素，而我们每次做入队的时候就相当于在其中一个栈的栈顶增加元素。而出队的时候我们要将做入队的栈的元素压入另一个栈中，这样做会使元素的顺序返回来这样先入栈的元素就被放到了栈顶，就可以了直接出栈，从而达到先入先出的效果。

### 2、代码：

```java
public class Question7 {

	private Stack<Integer> stack1 = new Stack<>();
	private Stack<Integer> stack2 = new Stack<>();

	public Question7() {
	}

	public void appendTail(int number) {
		stack1.push(number);
	}

	public int deleteHead() {
		if (stack2.size() <= 0) {
			while (stack1.size() > 0) {
				Integer pop = stack1.pop();
				stack2.push(pop);
			}
			return stack2.pop();
		} else {
			return stack2.pop();
		}
	}

	public static void main(String[] args) {
		Question7 question7 = new Question7();
		question7.appendTail(1);
		question7.appendTail(2);
		question7.appendTail(3);
		question7.appendTail(4);
		question7.appendTail(5);
		question7.appendTail(6);

		int i = question7.deleteHead();
		System.out.println(i);
	}

}
```

