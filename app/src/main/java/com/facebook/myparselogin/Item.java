package com.facebook.myparselogin;

import com.parse.ParseObject;
import com.parse.ParseClassName;


@ParseClassName("Item")
public class Item extends ParseObject {

    String upc;
    String name;
    String imageUrl;
    String ingredients;
    String warningLabel; // "May contain"

    // Public default constructor
    public Item(){
        super();
    }

    // Constructor that contains core properties
    public Item(String upc){
        setUpc(upc);
    }




    // Setters
    public void setUpc(String upc) {
        this.upc = upc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setWarningLabel(String warningLabel) {
        this.warningLabel = warningLabel;
    }


    // Getters - use getString and others to access fields
    public String getUpc() {
        return getString("upc");
    }

    public String getName() {
        return getString("name");
    }

    public String getImageUrl() {
        return getString("imageUrl");
    }

    public String getIngredients() {
        return getString("ingredients");
    }

    public String getWarningLabel() {
        return getString("warningLabel");
    }


}
