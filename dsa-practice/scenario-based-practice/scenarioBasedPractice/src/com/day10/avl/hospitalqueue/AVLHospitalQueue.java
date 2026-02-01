package com.day10.avl.hospitalqueue;

public class AVLHospitalQueue {

	PatientNode root;

    int height(PatientNode node) {
        return node == null ? 0 : node.height;
    }

    int getBalance(PatientNode node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }
    
    PatientNode rightRotate(PatientNode y) {
        PatientNode x = y.left;
        PatientNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }
    
    PatientNode leftRotate(PatientNode x) {
        PatientNode y = x.right;
        PatientNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }
    
    PatientNode insert(PatientNode node, int time, String name) {

        if (node == null)
            return new PatientNode(time, name);

        if (time < node.checkInTime)
            node.left = insert(node.left, time, name);
        else if (time > node.checkInTime)
            node.right = insert(node.right, time, name);
        else
            return node; // duplicate check-in time not allowed

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        int balance = getBalance(node);

        // LL
        if (balance > 1 && time < node.left.checkInTime)
            return rightRotate(node);

        // RR
        if (balance < -1 && time > node.right.checkInTime)
            return leftRotate(node);

        // LR
        if (balance > 1 && time > node.left.checkInTime) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL
        if (balance < -1 && time < node.right.checkInTime) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Find minimum value node
    PatientNode minValueNode(PatientNode node) {
        PatientNode curr = node;
        while (curr.left != null)
            curr = curr.left;
        return curr;
    }
    
    PatientNode delete(PatientNode root, int time) {

        if (root == null)
            return root;

        if (time < root.checkInTime)
            root.left = delete(root.left, time);
        else if (time > root.checkInTime)
            root.right = delete(root.right, time);
        else {

            if (root.left == null || root.right == null) {
                root = (root.left != null) ? root.left : root.right;
            } else {
                PatientNode temp = minValueNode(root.right);
                root.checkInTime = temp.checkInTime;
                root.patientName = temp.patientName;
                root.right = delete(root.right, temp.checkInTime);
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
    
    void inorder(PatientNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.println("Time: " + node.checkInTime +
                               " | Patient: " + node.patientName);
            inorder(node.right);
        }
    }
}