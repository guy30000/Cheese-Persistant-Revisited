package org.launchcode.repair_shop.models.forms;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Ticket {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=1, max=50, message = "Please enter item for repair")
    private String itemName;

    private String itemDescription;

    @NotNull
    @Size(min=1, max=10000, message = "Please enter reason or what is being repaired")
    private String itemIssue;

    private ArrayList<String> itemNotes;

    @ManyToOne
    private NewPeople customer;

    private boolean open;




    public Ticket(int id, String itemName, String itemDescription, String itemIssue, ArrayList itemNotes, boolean open) {
    }


    public Ticket() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemIssue() {
        return itemIssue;
    }

    public void setItemIssue(String itemIssue) {
        this.itemIssue = itemIssue;
    }

    public List<String> getItemNotes() {
        return itemNotes;
    }

    public void setItemNotes(ArrayList<String> itemNotes) {
        this.itemNotes = itemNotes;
    }

    public NewPeople getCustomer() {
        return customer;
    }

    public void setCustomer(NewPeople customer) {
        this.customer = customer;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
