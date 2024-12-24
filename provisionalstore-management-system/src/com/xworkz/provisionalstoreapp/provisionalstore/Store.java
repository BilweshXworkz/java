package com.xworkz.provisionalstoreapp.provisionalstore;

import com.xworkz.provisionalstoreapp.constant.CategoryType;
import com.xworkz.provisionalstoreapp.product.Product;

import java.util.Arrays;

public class Store {
    Product product[] = new Product[10];
    int index;

    public boolean addProductToStore(Product product){
        boolean isProductAdd = false;
        if (product.getProductID() > 0
                && product.getProductName() != null
                && product.getProductPrice() > 0
                && product.getProductQuantityOfStock() > 0){
            this.product[index++] = product;
            isProductAdd = true;
        }
        else {
            System.out.println("The Product is not Added");
        }
        return  isProductAdd;
    }

    public void getProduct(){
        if (product != null){
            for (Product p : product){
                if (p != null){
                    System.out.println("Product ID : "+p.getProductID());
                    System.out.println("The Product Category : "+p.getCategoryType());
                    System.out.println("Product Name : "+p.getProductName());
                    System.out.println("Product Brand : "+p.getProductBrand());
                    System.out.println("Product Mfg : "+p.getProductMfg());
                    System.out.println("Product Exp : "+p.getProductExp());
                    System.out.println("Product Quantity : "+p.getProductQuantity());
                    System.out.println("Product Price : "+p.getProductPrice());
                    System.out.println("Product Stock : "+p.getProductQuantityOfStock());
                    System.out.println("Product is Available : "+p.isProductAvailable());
                    System.out.println("=======================================================");
                }
            }
        }
        else {
            System.out.println("Product details not fetched ");
        }
    }

    public String getNameById(int productId){
        String isNameAvailable = null;
        for (Product product1 : product){
            if (product1.getProductID() == productId){
                isNameAvailable = product1.getProductName();
            }
        }
        if (isNameAvailable == null){
            System.out.println("The product name is not available");
        }
        return isNameAvailable;
    }

    public CategoryType getCategoryByName(String productName){
        CategoryType isCategoryAvailable = null;
        for (Product product1 : product){
            if (product1.getProductName() == productName){
                isCategoryAvailable = product1.getCategoryType();
            }
        }
        if (isCategoryAvailable == null){
            System.out.println("The product name is not available");
        }
        return isCategoryAvailable;
    }

    public String getBrandByCategory(CategoryType categoryName){
        String isBrandAvailabel = null;
        for (Product product1 : product){
            if(product1.getCategoryType() == categoryName){
                isBrandAvailabel = product1.getProductBrand();
            }
        }
        if (isBrandAvailabel == null){
            System.out.println("The product name is not available");
        }
        return isBrandAvailabel;
    }

    public int getPriceByName(String productName){
        int isPriceAvailable = 0;
        for (Product product1 : product){
            if (product1.getProductName() == productName){
                isPriceAvailable = product1.getProductPrice();
            }
        }
        if (isPriceAvailable == 0){
            System.out.println("The product name is not available");
        }
        return isPriceAvailable;
    }

    public int getQuantityByName(String productName){
        int isQuantityAvailable = 0;
        for (Product product1 : product){
            if (product1.getProductName() == productName){
                isQuantityAvailable = product1.getProductQuantity();
            }
        }
        if (isQuantityAvailable == 0){
            System.out.println("The product name is not available");
        }
        return isQuantityAvailable;
    }

    public String getExpiryDateById(int productId){
        String isExpriyDateAvailable = null;
        for (Product product1 : product){
            if (product1.getProductID() == productId){
                isExpriyDateAvailable = product1.getProductExp();
            }
        }
        if (isExpriyDateAvailable == null){
            System.out.println("The product name is not available");
        }
        return isExpriyDateAvailable;
    }

    public boolean updatePriceById(int productPrice, int productId){
        boolean isPriceUpdated = false;
        for (Product product1 : product){
            if (product1.getProductID() == productId){
                product1.setProductPrice(productPrice);
                isPriceUpdated = true;
            }
        }
        if (isPriceUpdated == false){
            System.out.println("The Product not Updated");
        }
        return isPriceUpdated;
    }

    public boolean updateQuantityByName(int productQuantity, String productName){
        boolean isQuantityUpdated = false;
        for (Product product1 : product){
            if (product1.getProductName() == productName){
                product1.setProductQuantity(productQuantity);
                isQuantityUpdated = true;
            }
        }
        if (isQuantityUpdated == false){
            System.out.println("The Product not Updated");
        }
        return isQuantityUpdated;
    }

    public boolean updateAvailabilityByName(boolean productAvailable, String productName){
        boolean isUpdatedAvailability = false;
        for (Product product1 : product){
           if (product1.getProductName() == productName){
               product1.setProductAvailable(productAvailable);
               isUpdatedAvailability = true;
           }
        }
        if (isUpdatedAvailability == false){
            System.out.println("The Product not Updated");
        }
        return isUpdatedAvailability;
    }

    public boolean deleteProductById(int productId){
        boolean isproductDeleted = false;
        int index;
        int newIndex = 0;
        for (index=0; index<product.length; index++){
            Product product1 = this.product[index];
            if (product1.getProductID() != productId){
                this.product[newIndex++] = this.product[index];
            }
            else {
                isproductDeleted = true;
            }
        }
        int size = newIndex;
        product = Arrays.copyOf(this.product, size);
        return isproductDeleted;
    }
}
