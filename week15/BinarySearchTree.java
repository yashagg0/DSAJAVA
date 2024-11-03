package week15;

public class BinarySearchTree {
    class Node{
        int val;
        Node left;
        Node right;
    }

    private Node root;
    public BinarySearchTree(int [] arr) {
        root = createTree(arr, 0, arr.length-1);
    }

    private  Node createTree(int [] arr, int low, int high){
        if (low > high) return null;  // to solve recursion infinetly
        int mid = (low+high)/2;
        Node nn = new Node();
        nn.val = arr[mid];
        nn.left = createTree(arr, low, mid -1); // it will recurse indefinetly 
        nn.right = createTree(arr, mid + 1, high);
        return nn;
    }

    private void display(Node nn){  //display function
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
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        BinarySearchTree bst = new BinarySearchTree(arr);
        bst.display(bst.root);
    }
}
