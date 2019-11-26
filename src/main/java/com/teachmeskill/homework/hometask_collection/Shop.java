package main.java.com.teachmeskill.homework.hometask_collection;

import java.util.*;

public class Shop {

    private List<Product> list;

    public Shop(List<Product> list) {
        this.list = list;
    }

    public Shop() {
        list = new ArrayList<>();
    }

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    public void addProduct(Product product) {
        if (list.contains(product)) {
            System.out.println("Товар с таким id уже существует! ");
        } else {
            list.add(product);
        }
    }

    public void printListProduct() {
        for (Product product : list) {
            System.out.println(product);
        }
    }

    public void removeProduct(int deleteId) {
        for (int i = 0; i <= list.size(); i++) {
            if (list.get(i).getId() == deleteId) {
                list.remove(i);
                break;
            }
        }
    }

    public void editListProduct(Product product) {
        for (int i = 0; i <= list.size(); i++) {
            if (product.equals(list.contains(product))) {
                list.remove(list.contains(product));
                list.add(product);
                break;
            } else {
                list.add(product);
                break;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(list, shop.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "list=" + list +
                '}';
    }
}
