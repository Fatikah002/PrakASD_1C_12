package P14;

public class BinaryTree12 {
    Node12 root;

    public BinaryTree12() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    // void add(int data) {
    // if (isEmpty()) {
    // root = new Node12(data);
    // } else {
    // Node12 current = root;
    // while (true) {
    // if (data < current.data) {
    // if (current.left != null) {
    // current = current.left;
    // } else {
    // current.left = new Node12(data);
    // break;
    // }
    // } else if (data > current.data) {
    // if (current.right != null) {
    // current = current.right;
    // } else {
    // current.right = new Node12(data);
    // break;
    // }
    // } else {
    // break;
    // }
    // }
    // }
    // }

    Node12 addRekursif(Node12 current, int data) {
        if (current == null) {
            return new Node12(data);
        }

        if (data < current.data) {
            current.left = addRekursif(current.left, data);
        } else if (data > current.data) {
            current.right = addRekursif(current.right, data);
        }
        return current;
    }

    boolean find(int data) {
        boolean result = false;
        Node12 current = root;
        while (current != null) {
            if (current.data == data) {
                return true;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    void traversePreOrder(Node12 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node12 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node12 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node12 getSuccessor(Node12 del) {
        Node12 successor = del.right;
        Node12 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        Node12 parent = root;
        Node12 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Couldn't find data");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node12 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }

    void nilaiTerkecil() {
        if (isEmpty()) {
            System.out.println("Tree is empty.");
            return;
        }
        Node12 current = root;
        while (current.left != null) {
            current = current.left;
        }

        System.out.println("Nilai yang paling kecil : " + current.data);
    }

    void nilaiTerbesar() {
        if (isEmpty()) {
            System.out.println("Tree is empty.");
            return;
        }
        Node12 current = root;
        while (current.right != null) {
            current = current.right;
        }

        System.out.println("Nilai yang paling besar : " + current.data);
    }

    void leaf(Node12 node) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }

        leaf(node.left);
        leaf(node.right);
    }

    int jumlahLeaf(Node12 node){
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }

        int jmlKiri = jumlahLeaf(node.left);
        int jmlKanan = jumlahLeaf(node.right);
        return jmlKiri + jmlKanan;
    }
}
