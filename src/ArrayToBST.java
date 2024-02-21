class Node{
    int key;
    Node left,right;

    public Node(int key){
        this.key=key;
    }
}
public class ArrayToBST {
    public Node sortArrToBST(int[] nums){
        if(nums==null || nums.length==0){
            return null;
        }
        return sortArrToBST(nums,0,nums.length-1);
    }

    private Node sortArrToBST(int nums[],int start,int end){
        if(start>end){
            return null;
        }
        int mid=start+(end-start)/2;
        Node root=new Node(nums[mid]);

        root.left=sortArrToBST(nums,start,mid-1);
        root.right=sortArrToBST(nums,mid+1,end);

        return root;
    }

    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.key+" ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        ArrayToBST tree=new ArrayToBST();
        int a[]={1,2,3,4,5,6,7};

        Node root=tree.sortArrToBST(a);
        tree.inorder(root);
    }
}
