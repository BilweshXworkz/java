package com.xworkz.provisionalstoreapp.product;

import com.xworkz.provisionalstoreapp.constant.CategoryType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Product {
    private CategoryType categoryType;
    private int productID;
    private String productName;
    private String productBrand;
    private String productMfg;
    private String productExp;
    private int productQuantity;
    private int productPrice;
    private int productQuantityOfStock;
    private  boolean isProductAvailable;

    @Override
    public int hashCode(){
        return this.productID;
    }

    @Override
    public String toString(){
        return "Product ID : "+productID+", " +
                "Product Name : "+productName+"," +
                " Product Brand : "+productBrand+"," +
                "Product Mfg : "+productMfg+"," +
                "Product Exp : "+productExp+", " +
                "Product Quantity : "+productQuantity+"," +
                "Product Price : "+productPrice+"," +
                "Quantity Of Stock : "+productQuantityOfStock+"," +
                "Available : "+isProductAvailable+".";
    }

    @Override
    public boolean equals(Object obj){
        Product product = (Product) obj;
        if(this.productID == product.productID &&
                this.productName == product.productName &&
                this.productBrand == product.productBrand &&
                this.productMfg == product.productMfg &&
                this.productExp == product.productExp &&
                this.productQuantity == product.productQuantity &&
                this.productPrice == product.productPrice &&
                this.productQuantityOfStock == product.productQuantityOfStock &&
                this.isProductAvailable == product.isProductAvailable)
            return true;
        return false;
    }
}
