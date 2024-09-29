package org.example;

import java.util.HashSet;
import java.util.Set;

public class Product {

    private String name;
    private Set<Product> children;
    private Set<Product> parents;

    public Product(String name) {
        this.name = name;
        this.children = new HashSet<>();
        this.parents = new HashSet<>();
    }

    public boolean addProduct(Product p) {
        Set<Product> visited = new HashSet<>();

        if (p == this || hasCycleDFS(p, visited) || parents.contains(p)) {
            return false;
        }

        p.parents.addAll(this.parents);
        p.parents.add(this);
        this.children.add(p);
        return true;
    }

    private boolean hasCycleDFS(Product p, Set<Product> visited) {
        if (visited.contains(this)) {
            return true;
        }

        visited.add(this);

        for (Product child : children) {
            if (child == p || child.hasCycleDFS(p, visited)) {
                return true;
            }
        }

        return false;
    }

}
