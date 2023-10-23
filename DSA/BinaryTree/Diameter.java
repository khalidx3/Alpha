public class Diameter {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }
    //Approch 1 - O(n2)
    public static int diameter1(Node root){
        if(root==null){
            return 0;
        }
        int ldia = diameter1(root.left);
        int rdia = diameter1(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int selfdia = lh+rh+1;

        return Math.max(selfdia, Math.max(ldia,rdia));
    }
    static class Info{
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    //Approch 2 - O(n)
    public static Info diameter2(Node root){
        if(root == null){
            return new Info(0, 0);
        }

        Info lInfo = diameter2(root.left);
        Info rInfo = diameter2(root.right);

        int diam = Math.max(Math.max(lInfo.diam,rInfo.diam),lInfo.ht + rInfo.ht + 1);
        int ht = Math.max(lInfo.ht, rInfo.ht)+1;

        return new Info(diam, ht);
    }
    public static void main(String[] args) {
        /*  1
          /   \
         2     3 
        / \   / \
       4   5  6  7 
       */
      Node root = new Node(1);
      root.left = new Node(2);
      root.right = new Node(3);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.right.left = new Node(6);
      root.right.right = new Node(7);

      System.out.println(diameter1(root));
      System.out.println(diameter2(root).diam);
    }
}
