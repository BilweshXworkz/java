package com.xworkz.provisionalstoreapp;

import com.xworkz.provisionalstoreapp.constant.CategoryType;
import com.xworkz.provisionalstoreapp.product.Product;
import com.xworkz.provisionalstoreapp.provisionalstore.Store;

public class ProvisionalStoreRunner {
    public static void main(String[] args) {
        Product product = new Product();
        product.setProductID(101);
        product.setCategoryType(CategoryType.PersonalCare);
        product.setProductName("ToothPaste");
        product.setProductBrand("Colgate");
        product.setProductMfg("15/01/2024");
        product.setProductExp("15/01/2025");
        product.setProductPrice(50);
        product.setProductQuantity(1);
        product.setProductQuantityOfStock(200);
        product.setProductAvailable(true);
        System.out.println(product);

        Product product1 = new Product();
        product1.setProductID(102);
        product1.setCategoryType(CategoryType.Food);
        product1.setProductName("Rice");
        product1.setProductBrand("India Gate");
        product1.setProductMfg("15/01/2024");
        product1.setProductExp("15/01/2025");
        product1.setProductPrice(500);
        product1.setProductQuantity(5);
        product1.setProductQuantityOfStock(100);
        product1.setProductAvailable(true);
        System.out.println(product1);

        Product product2 = new Product();
        product2.setProductID(103);
        product2.setCategoryType(CategoryType.Food);
        product2.setProductName("Cooking Oil");
        product2.setProductBrand("Fortune");
        product2.setProductMfg("28/02/2024");
        product2.setProductExp("28/02/2025");
        product2.setProductPrice(150);
        product2.setProductQuantity(1);
        product2.setProductQuantityOfStock(200);
        product2.setProductAvailable(true);
        System.out.println(product2);

        Product product3 = new Product();
        product3.setProductID(104);
        product3.setCategoryType(CategoryType.PackedFood);
        product3.setProductName(" Instant Noodles");
        product3.setProductBrand(" Maggi");
        product3.setProductMfg("15/01/2024");
        product3.setProductExp("12/08/2024");
        product3.setProductPrice(12);
        product3.setProductQuantity(1);
        product3.setProductQuantityOfStock(100);
        product3.setProductAvailable(true);
        System.out.println(product3);

        Product product4 = new Product();
        product4.setProductID(105);
        product4.setCategoryType(CategoryType.PackedFood);
        product4.setProductName("Biscuits");
        product4.setProductBrand("Parle-G");
        product4.setProductMfg("01/01/2024");
        product4.setProductExp("16/08/2024");
        product4.setProductPrice(20);
        product4.setProductQuantity(1);
        product4.setProductQuantityOfStock(150);
        product4.setProductAvailable(true);
        System.out.println(product4);

        Product product5 = new Product();
        product5.setProductID(106);
        product5.setCategoryType(CategoryType.DiaryProduct);
        product5.setProductName("Milk");
        product5.setProductBrand("Amul");
        product5.setProductMfg("15/01/2024");
        product5.setProductExp("17/01/2024");
        product5.setProductPrice(60);
        product5.setProductQuantity(1);
        product5.setProductQuantityOfStock(100);
        product5.setProductAvailable(true);
        System.out.println(product5);

        Product product6 = new Product();
        product6.setProductID(107);
        product6.setCategoryType(CategoryType.DiaryProduct);
        product6.setProductName("Cheese Slices");
        product6.setProductBrand("Britannia");
        product6.setProductMfg("16/11/2024");
        product6.setProductExp("19/11/2024");
        product6.setProductPrice(120);
        product6.setProductQuantity(1);
        product6.setProductQuantityOfStock(50);
        product6.setProductAvailable(true);
        System.out.println(product6);

        Product product7 = new Product();
        product7.setProductID(108);
        product7.setCategoryType(CategoryType.PersonalCare);
        product7.setProductName("Shampoo");
        product7.setProductBrand("Dove");
        product7.setProductMfg("15/11/2024");
        product7.setProductExp("16/11/2025");
        product7.setProductPrice(100);
        product7.setProductQuantity(1);
        product7.setProductQuantityOfStock(50);
        product7.setProductAvailable(true);
        System.out.println(product7);

        Product product8 = new Product();
        product8.setProductID(109);
        product8.setCategoryType(CategoryType.HouseholdEssentials);
        product8.setProductName("Dishwashing Liquid");
        product8.setProductBrand("Vim");
        product8.setProductMfg("15/11/2024");
        product8.setProductExp("15/11/2025");
        product8.setProductPrice(100);
        product8.setProductQuantity(1);
        product8.setProductQuantityOfStock(100);
        product8.setProductAvailable(true);
        System.out.println(product8);

        Product product9 = new Product();
        product9.setProductID(110);
        product9.setCategoryType(CategoryType.ChildProduct);
        product9.setProductName("Baby Diapers");
        product9.setProductBrand("Pampers");
        product9.setProductMfg("15/10/2024");
        product9.setProductExp("15/10/2025");
        product9.setProductPrice(800);
        product9.setProductQuantity(1);
        product9.setProductQuantityOfStock(100);
        product9.setProductAvailable(true);
        System.out.println(product9);

        System.out.println(product.hashCode());
        System.out.println(product2.hashCode());

        boolean isEqualTo = product.equals(product2);
        System.out.println(isEqualTo);


        System.out.println("================================");
        Store store = new Store();
        store.addProductToStore(product);
        store.addProductToStore(product1);
        store.addProductToStore(product2);
        store.addProductToStore(product3);
        store.addProductToStore(product4);
        store.addProductToStore(product5);
        store.addProductToStore(product6);
        store.addProductToStore(product7);
        store.addProductToStore(product8);
        store.addProductToStore(product9);
        store.getProduct();

//        getNameById
        String returnNameById = store.getNameById(101);
        System.out.println("The Product Name : "+returnNameById);

//        getCategoryByName
        CategoryType returnCategoryByName = store.getCategoryByName("ToothPaste");
        System.out.println("Category Type : "+returnCategoryByName);

//        getBrandByCategory
        String returnBrandByCategory = store.getBrandByCategory(CategoryType.PersonalCare);
        System.out.println("Brand Name : "+returnBrandByCategory);

//       getPriceByName
        int returnPriceByName = store.getPriceByName("ToothPaste");
        System.out.println("Price is : "+returnPriceByName);

//        getQuantityByName
        int returnQuantityByName = store.getQuantityByName("ToothPaste");
        System.out.println("Quantity of Product : "+returnQuantityByName);

//        getExpiryDateById
        String returnExpiryDateById = store.getExpiryDateById(101);
        System.out.println("Exp : "+returnExpiryDateById);

//        updatePriceById
        boolean returnUpdatePriceById = store.updatePriceById(45, 101);
        System.out.println("The Product Updated : "+returnUpdatePriceById);
        store.getProduct();

//        updateQuantityByName
        boolean returnUpdateQuantityByName = store.updateQuantityByName(2, "ToothPaste");
        System.out.println("The Product Updated : "+returnUpdateQuantityByName);
        store.getProduct();

//        updateAvailabilityByName
        boolean returnupdateAvailabilityByName = store.updateAvailabilityByName(false, "ToothPaste");
        System.out.println("The Product Updated : "+returnupdateAvailabilityByName );
        store.getProduct();

//        deleteProductById
        boolean returnDeleteProductId = store.deleteProductById(101);
        System.out.println("The Product is Deleted." +returnDeleteProductId);
        store.getProduct();
    }
}
