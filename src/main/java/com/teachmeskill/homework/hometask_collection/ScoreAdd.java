package main.java.com.teachmeskill.homework.hometask_collection;

import java.util.Collections;
import java.util.List;

public class ScoreAdd {
    public static void main(String[] args) {

        Shop shop = new Shop();
        Product milk = new Product(1, "Milk", 3);
        Product tea = new Product(2, "Tea", 5);
        Product coffee = new Product(4, "Coffee", 10);
        Product beer = new Product(3, "Beer", 7);
        Product steak = new Product(10, "Steak", 15);
        Product juice = new Product(5, "Juice", 2);

        shop.addProduct(tea);
        shop.addProduct(milk);
        shop.addProduct(coffee);
        shop.addProduct(beer);
        shop.addProduct(juice);

        List<Product> listProduct = shop.getList();

        System.out.println("===========================================================================================");
        System.out.println("*****Список товаров (сортировка по цене)*****");

        ProductSortPrice productSortPrice = new ProductSortPrice();
        Collections.sort(listProduct, productSortPrice);
        shop.printListProduct();

        System.out.println("===========================================================================================");
        System.out.println("*****Список товаров (сортировка по добавлению товара)*****");

        shop.removeProduct(1);
        System.out.println(shop.getList());

        System.out.println("===========================================================================================");
        System.out.println("*****Список товаров (отредактированный)*****");

        shop.editListProduct(steak);
        shop.printListProduct();

        System.out.println("===========================================================================================");
    }
}
