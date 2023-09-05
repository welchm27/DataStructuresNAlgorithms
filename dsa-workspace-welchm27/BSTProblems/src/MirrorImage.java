public class MirrorImage {

    public static void swap(BNode node){
        if(node == null)
            return;

        BNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;
    }

    public static void convertTreeMirror(BNode node){
        if (node == null)
            return;
        convertTreeMirror(node.left);
        convertTreeMirror(node.right);
        swap(node);
    }

    public static void preOrder(BNode node){
        if(node == null)
            return;
        System.out.println(node.getData());
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {
        BNode root = new BNode(5);
        root.left = new BNode(2);
        root.right = new BNode(6);
        root.left.right = new BNode(4);
        root.left.left = new BNode(1);

        AllPathsInTree.printRootToLeafPaths(root);
        convertTreeMirror(root);
        AllPathsInTree.printRootToLeafPaths(root);

    }
}