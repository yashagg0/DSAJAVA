package week15;
import java.util.*;

public class BinaryTrees {
    public class Node{
        int val;
        Node left;;
        Node right;
    }

    Node root;  // accessing our Binary Tree
    Scanner sc = new Scanner(System.in);

    public BinaryTrees(){     // constructor
        root = createTree();
    }

    public Node createTree(){
        System.out.println("Value: ");
        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;

        System.out.println("Has left?");
        boolean hlc = sc.nextBoolean();     //has left child hlc
        if (hlc)
            nn.left = createTree();

        System.out.println("Has Right?");
        boolean hrc = sc.nextBoolean();
        if(hrc)
            nn.right = createTree();

        return nn;
    }

    public void Display(){
        display(root);
    }
    private void display(Node nn){
        if (nn == null)
            return;
        String output = "";
        output = "<--" + nn.val+ "-->";

        if(nn.left == null)
            output += "Null" + output;
        else
            output = nn.left.val+ output;

        if (nn.right == null)
            output += "Null";
        else
            output += nn.right.val;

        System.out.println(output);
        display(nn.left);
        display(nn.right);
    }

    public int findMax (Node root){
        if (root == null){
            return -1;
        }
        int lmax = findMax(root.left);
        int rmax = findMax(root.right);

        return Math.max (root.val, Math.max(lmax,rmax));
    }

    public boolean hasPresent(Node root, int item){
        if (root == null){
            return false;
        }
        if (root.val == item){
            return true;
        }
        boolean left = hasPresent(root.left, item);
        boolean right = hasPresent(root.right, item);

        return (left || right);
    }

    public int height(Node root, int count){
        if (root == null){
            return count;
        }
        height(root.left, count++);
        height(root.right, count++);
        return count+1;
    }

    public void infix(Node root){
        if (root == null) return;

        infix(root.left);
        System.out.print(root.val+ " ");
        infix(root.right);
    }

    public void prefix(Node root){
        if (root == null) return;

        System.out.print(root.val+ " ");
        prefix(root.left);
        prefix(root.right);
    }

    public void postfix(Node root){
        if (root == null) return;

        postfix(root.left);
        postfix(root.right);
        System.out.print(root.val+ " ");
    }

    //LEVEL ORDER TRAVERSAL
    public void levelOrderTraversal(){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node rv = q.remove();
            System.out.print(rv.val + " ");
            if (rv.left != null) 
                q.add(rv.left);
            if (rv.right != null)
                q.add(rv.right);
        }
        System.out.println();
    }
}
