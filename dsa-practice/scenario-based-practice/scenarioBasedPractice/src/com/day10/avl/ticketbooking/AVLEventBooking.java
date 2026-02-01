package com.day10.avl.ticketbooking;

public class AVLEventBooking {

	EventNode root;

    int height(EventNode node) {
        return node == null ? 0 : node.height;
    }

    int getBalance(EventNode node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }
    
    EventNode rightRotate(EventNode y) {
        EventNode x = y.left;
        EventNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }
    
    EventNode leftRotate(EventNode x) {
        EventNode y = x.right;
        EventNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }
    
    EventNode insert(EventNode node, int time, String name) {

        if (node == null)
            return new EventNode(time, name);

        if (time < node.startTime)
            node.left = insert(node.left, time, name);
        else if (time > node.startTime)
            node.right = insert(node.right, time, name);
        else
            return node; // duplicate time not allowed

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        int balance = getBalance(node);

        // LL
        if (balance > 1 && time < node.left.startTime)
            return rightRotate(node);

        // RR
        if (balance < -1 && time > node.right.startTime)
            return leftRotate(node);

        // LR
        if (balance > 1 && time > node.left.startTime) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL
        if (balance < -1 && time < node.right.startTime) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }
    
    EventNode minValueNode(EventNode node) {
        EventNode curr = node;
        while (curr.left != null)
            curr = curr.left;
        return curr;
    }
    
    EventNode delete(EventNode root, int time) {

        if (root == null)
            return root;

        if (time < root.startTime)
            root.left = delete(root.left, time);
        else if (time > root.startTime)
            root.right = delete(root.right, time);
        else {

            if (root.left == null || root.right == null) {
                root = (root.left != null) ? root.left : root.right;
            } else {
                EventNode temp = minValueNode(root.right);
                root.startTime = temp.startTime;
                root.eventName = temp.eventName;
                root.right = delete(root.right, temp.startTime);
            }
        }

        if (root == null)
            return root;

        root.height = Math.max(height(root.left), height(root.right)) + 1;
        int balance = getBalance(root);

        // LL
        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        // LR
        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // RR
        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        // RL
        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }
    
    void inorder(EventNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.println("Time: " + node.startTime + " | Event: " + node.eventName);
            inorder(node.right);
        }
    }
}
