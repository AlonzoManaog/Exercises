class Node
{
    Logs log;
    int height;
    Node left;
    Node right;

    Node(Logs log)
    {
        this.log = log;
        height = 1;
    }
}

public class AVL {
    
    Node root;

    void insertion(Logs log)
    {
        root = insertNode(root, log);
    }
    void deletion(int year){
        root=deleteNode(root,year);
    }
    //Inserts the element into the node
    Node insertNode(Node node, Logs log)
    {
        if (node == null)
        {
            return new Node(log);
        }
        if (log.year < node.log.year)
        {
            node.left = insertNode(node.left, log);
        }
        else if (log.year > node.log.year)
        {
            node.right = insertNode(node.right, log);
        }
        else
        {
            return node;
        }
        node.height = getMax(getHeight(node.left), getHeight(node.right)) + 1;
        int balanceFactor = getBalanceFactor(node);

        if (balanceFactor > 1)
        {
            if (log.year < node.left.log.year)
            {
                return rightRotate(node);
            }
            else
            {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if (balanceFactor < -1)
        {
            if (log.year > node.right.log.year)
            {
                return leftRotate(node);
            }
            else
            {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }
    Node minValueNode(Node root){
        while (root.left != null){
            root = root.left; 
            }
        return root;
    }
    Node deleteNode(Node node, int year)
    {
        if (node == null)
        {
            return node;
        }
        if (year < node.log.year)
        {
            node.left = deleteNode(node.left, year);
        }
        else if (year > node.log.year)
        {
            node.right = deleteNode(node.right, year);
        }
        //Since not greater or less than we know this is the year to be removed
        else
        { 
            //Checks if one child or no child of node
            if ((node.left == null) || (node.right == null)) 
            { 
                Node temp = null; 
                //Checks if one child
                if (temp == node.left){
                    temp = node.right; 
                }
                else{
                    temp = node.left; 
                }
                //For no child case
                if (temp == null) { 
                    temp = node; 
                    node = null; 
                } 
                //For one child case
                else {
                node = temp; 
                }
            }
            //For two child case
            else{ 
                //It finds the lowest value towards the left and sets the current node = to that and remove the right node of the current
                //Then run the one child case
                Node temp=minValueNode(node.right);
                node.log.year=temp.log.year;
                node.right = deleteNode(node.right, temp.log.year); 
            } 
        } 
        return node;  
    }
    //Rotating tree to the right to balance
    Node rightRotate(Node node)
    {
        Node newRoot = node.left;
        node.left = newRoot.right;
        newRoot.right = node;
        node.height = getMax(getHeight(node.left), getHeight(node.right)) + 1;
        newRoot.height = getMax(getHeight(newRoot.left), getHeight(newRoot.right)) + 1;
        return newRoot;
    }
    //Rotating tree to the left to balance
    Node leftRotate(Node node)
    {
        Node newRoot = node.right;
        node.right = newRoot.left;
        newRoot.left = node;
        node.height = getMax(getHeight(node.left), getHeight(node.right)) + 1;
        newRoot.height = getMax(getHeight(newRoot.left), getHeight(newRoot.right)) + 1;
        return newRoot;
    }
    //Finds the height of the node compared to the root
    int getHeight(Node node)
    {
        if (node == null)
        {
            return 0;
        }
        return node.height;
    }
    //Finds the highest value
    int getMax(int a, int b)
    {
        return (a > b) ? a : b;
    }//Getting the balance factor
    int getBalanceFactor(Node node)
    {
        if (node == null)
        {
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }
    //Prints the nods
    void preOrder(Node node)
    {
        if (node == null)
        {
            return;
        }
        else
        {
            System.out.println(node.log + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    
}