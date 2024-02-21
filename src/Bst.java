public class Bst {
    Node root;

    public Bst(){
        root=null;
    }
    public void insert(int key){
        root=insertRec(root,key);
    }

    private Node insertRec(Node root,int key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(key<root.key)
        root.left=insertRec(root.left, key);
        else if(key>root.key)
        root.right=insertRec(root.right, key);

        return root;
    }
    //search method to search any element is present in bst or not
    public boolean search(int key){
        return searchRec(root,key);
    }

    private boolean searchRec(Node root,int key){
        if(root==null || root.key==key){
            return root!= null;
        }
        if(key>root.key)
        return searchRec(root.left,key);

        return searchRec(root.right,key);
    }
    public void inorder(){
        inorderRec(root);
    }
    private void inorderRec(Node root){
        if(root!=null){
            inorderRec(root.left);
            System.out.print(root.key+" ");
            inorderRec(root.right);

        }
    }
    public void preorder(){
        preorderRec(root);
    }

    private void preorderRec(Node root){
        if(root!=null){
            System.out.print(root.key+" ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        Bst tree=new Bst();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        tree.inorder();

        System.out.println();
        tree.preorder();
        System.out.println();
        System.out.println("search for 40:"+(tree.search(40)?"Found":"Not Found"));
    
    }
}   

class Node{
    int key;
    Node left,right;

    public Node(int item){
        key=item;
        left=right=null;
    }
}


