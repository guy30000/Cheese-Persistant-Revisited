package org.launchcode.general_Store.models;

import org.launchcode.general_Store.models.Inventory;
import java.util.ArrayList;

import org.launchcode.general_Store.models.Inventory;
import org.launchcode.general_Store.models.data.InventoryDao;
import org.launchcode.general_Store.models.forms.ReceiveInvForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.ArrayList;

public class InventorySearch {

    @Autowired
    private InventoryDao inventoryDao;

    ArrayList<Inventory> searchResults = new ArrayList<>();

    public InventorySearch(String keyword) {
    }

    public ArrayList InventorySearch(String keyword) {

        for (Inventory singleItem : inventoryDao.findAll()) {
            if (singleItem.getName().toLowerCase().contains(keyword.toLowerCase()) || singleItem.getVendor().toLowerCase().contains(keyword.toLowerCase()) || singleItem.getSku().equalsIgnoreCase(keyword)) {
                searchResults.add(singleItem);
                System.out.println("thing thing thing "  + singleItem);
            }
        }
        return searchResults;
    }

    public InventorySearch() {}


    public ArrayList getSearchResults() {
        return searchResults;
    }

}
