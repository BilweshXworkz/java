package com.xworkz.ecomapp.ecommercefeature;

import com.xworkz.ecomapp.ecommerce.ECommerce;

public interface ECommerceFeature {
    public boolean addProduct(ECommerce eCommerce);
    public void getProductDetails();
    public String getProductNameByProductID(int productID);
    public double getPriceByProductName(String productName);
    public String getMaterialByProductName(String productName);
    public String getProductNameByBrand(String brand);
    public double updatePriceByProductName(String productName);
    public boolean deleteProductByProductName(String productName);
}
