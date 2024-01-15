/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.htmltree;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.BorderLayout;
import java.util.Collections;
import javax.swing.JPanel;
public class HTMLTree {

    public static void main(String[] args) {
          JFrame frame = new JFrame ("HTML TREE");
          frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
          frame.setSize(500, 300);

          DefaultMutableTreeNode root = new DefaultMutableTreeNode("HTML");
          DefaultMutableTreeNode body = new DefaultMutableTreeNode("body");
          DefaultMutableTreeNode ul = new DefaultMutableTreeNode("ul");
          DefaultMutableTreeNode li = new DefaultMutableTreeNode("li");
          DefaultMutableTreeNode lu = new DefaultMutableTreeNode("li");
          DefaultMutableTreeNode h1 = new DefaultMutableTreeNode("h1");
          DefaultMutableTreeNode h2 = new DefaultMutableTreeNode("h2");
          DefaultMutableTreeNode a = new DefaultMutableTreeNode("a");
          DefaultMutableTreeNode head = new DefaultMutableTreeNode("head");
          DefaultMutableTreeNode meta = new DefaultMutableTreeNode("meta");
          DefaultMutableTreeNode title = new DefaultMutableTreeNode("title");
          
          root.add(head);
          head.add(meta);
          head.add(title);
          root.add(body);
          body.add(ul);
          ul.add(li);
          ul.add(lu);
          body.add(h1);
          body.add(h2);
          h2.add(a);
          
          JTree tree = new JTree(root);
          JScrollPane sPane = new JScrollPane (tree);
          frame.add(sPane);
          sPane.setBackground(Color.yellow);
          frame.setVisible(true);
          frame.setLocation(500,250);
          
          // Enumeration
          System.out.println("Root node " + root.getRoot());
          System.out.println("Parent node " + root.getParent());
          System.out.println("Sibling node " + root.getSiblingCount());
          System.out.println("One-Level subtrees " + root.getLevel());
          System.out.println("Nodes per Level " + root.getLeafCount());
          System.out.println("Depth " + root.getDepth());
          System.out.println("degree of each level " + root.getChildCount());
          System.out.println("list of nodes based on breadth-first " + Collections.list(root.breadthFirstEnumeration()) );
          System.out.println("list of nodes based on preorder " + Collections.list (root.preorderEnumeration()));
          System.out.println("list of nodes based on postoder " + Collections.list (root.postorderEnumeration()));

    }
}

