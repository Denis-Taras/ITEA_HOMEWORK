package com.company.denis.Homework8.Payment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import static com.company.denis.Homework8.Payment.DataUtilProduct.readQuantity;
import static com.company.denis.Homework8.Payment.DataUtilProduct.searchProduct;


public class Payment {
    public int amountMoneyPay(Map<Product, Integer> shoppingList) {
        int sum = 0;
        for (Map.Entry<Product, Integer> pair : shoppingList.entrySet()) {
            sum += pair.getKey().getPrice() * pair.getValue();
        }
        return sum;
    }

    public void printShoppingList(Map<Product, Integer> shoppingList) {
        System.out.println("Список покупок:");
        for (Map.Entry<Product, Integer> pair : shoppingList.entrySet()) {
            System.out.println(pair.getKey().toString() + " - " + pair.getValue() + " шт.");
        }
        System.out.println("Сумма к оплате: " + amountMoneyPay(shoppingList) + " у.е.");
    }

    public class Order {
        private Map<Product, Integer> orderList;

        public Map<Product, Integer> getOrderList() {
            return orderList;
        }

        public void createShoppingList() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Map shoppingList = new HashMap<Product, Integer>();
            boolean search = true;
            while (search) {
                Product product = searchProduct(reader);
                Integer quantity = readQuantity(reader);
                shoppingList.put(product, quantity);
                while (true) {
                    System.out.print("Продолжить выбор товара (ДА/НЕТ)? - ");
                    String continued = reader.readLine();
                    if (continued.equalsIgnoreCase("ДА")) {
                        search = true;
                        break;
                    } else if (continued.equalsIgnoreCase("НЕТ")) {
                        search = false;
                        break;
                    } else {
                        System.out.println("Попробуйте еще раз.");
                    }
                }
            }
            this.orderList = shoppingList;
        }
    }
}
