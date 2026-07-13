import java.util.*;
public class code3{
    public static void main(String[] args) {
        
    }
 public int abc(){
Stack<TreeNode> stack = new Stack<>();
LinkedList<Integer> ans = new LinkedList<>();

if (root == null)
    return ans;

stack.push(root);

while (!stack.isEmpty()) {
    TreeNode curr = stack.pop();
    ans.addFirst(curr.val);

    if (curr.left != null)
        stack.push(curr.left);

    if (curr.right != null)
        stack.push(curr.right);
}

return ans;

}}
