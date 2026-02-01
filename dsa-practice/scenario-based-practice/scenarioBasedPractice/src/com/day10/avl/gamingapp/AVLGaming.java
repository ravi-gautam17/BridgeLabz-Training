package com.day10.avl.gamingapp;

import java.util.*;

public class AVLGaming {

	PlayerNode root;
	
	int height(PlayerNode node) {
		return node == null ? 0 : node.height;
	}
	
	int getBalance(PlayerNode node) {
		return node == null ? 0 : height(node.left) - height(node.right);
	}
	
	PlayerNode rightRotate(PlayerNode y) {
		PlayerNode x = y.left;
		PlayerNode T2 = x.right;
		
		x.right = y;
		y.left = T2;
		
		y.height = Math.max(height(y.left), height(y.right)) + 1;
		x.height = Math.max(height(x.left), height(x.right)) + 1;
		
		return x;
	}
	
	PlayerNode leftRotate(PlayerNode x) {
		PlayerNode y = x.right;
		PlayerNode T2 = y.left;
		
		y.left = x;
		x.right = T2;
		
		x.height = Math.max(height(x.left), height(x.right)) + 1;
		y.height = Math.max(height(y.left), height(y.right)) + 1;
		
		return y;
	}
	
	PlayerNode insert(PlayerNode node, String name, int points) {
		if(node == null) {
			return new PlayerNode(name, points);
		}
		
		if(points < node.points)
			node.left = insert(node.left, name, points);
		else if(points > node.points)
			node.right = insert(node.right, name, points);
		else
			return node;
		
		node.height = 1 + Math.max(height(node.left), height(node.right));
		
		int balance = getBalance(node);
		
		// LL case
		if (balance > 1 && points < node.left.points)
            return rightRotate(node);

        // RR
        if (balance < -1 && points > node.right.points)
            return leftRotate(node);

        // LR
        if (balance > 1 && points > node.left.points) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL
        if (balance < -1 && points < node.right.points) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
		return node;
	}
	
	PlayerNode minValueNode(PlayerNode node) {
        PlayerNode curr = node;
        while (curr.left != null)
            curr = curr.left;
        return curr;
    }
	
	PlayerNode delete(PlayerNode root, int points) {

        if (root == null)
            return root;

        if (points < root.points)
            root.left = delete(root.left, points);
        else if (points > root.points)
            root.right = delete(root.right, points);
        else {

            if (root.left == null || root.right == null) {
                root = (root.left != null) ? root.left : root.right;
            } else {
                PlayerNode temp = minValueNode(root.right);
                root.points = temp.points;
                root.name = temp.name;
                root.right = delete(root.right, temp.points);
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
	
	void getTopPlayers(PlayerNode node, List<PlayerNode> list) {
        if (node == null || list.size() >= 10)
            return;

        getTopPlayers(node.right, list); // higher points first

        if (list.size() < 10)
            list.add(node);

        getTopPlayers(node.left, list);
    }
}
