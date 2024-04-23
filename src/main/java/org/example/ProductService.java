package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product>products;
    public ProductService(){
        products=new ArrayList<>();
        //Инициализация 10 продуктов
        for (int i=1; i<=10; i++)
        {
    products.add(new Product( i,"Product" +i,i*10,0));
}
}
public void displayProducts(){
        for (Product product: products){
            if (product.getName().equals(name)){
                return product;
            }


        }
        return null;
        

    }
}
