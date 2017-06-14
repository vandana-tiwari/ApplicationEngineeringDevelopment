/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Funds;

import java.util.Date;

/**
 *
 * @author vanda
 */
public class Fund {
    //private static float initialMayorFunds = 10000;
    private String allocatedTo ="";
    private float closingBalance ;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate() {
        this.date = new Date();
    }

//    public float getInitialFunds() {
//        return initialMayorFunds;
//    }

    public float getClosingBalance() {
        return closingBalance;
    }

    public void setClosingBalance(float closingBalance) {
        this.closingBalance = closingBalance;
    }

//    public void setInitialFunds(float initialFunds) {
//        this.initialMayorFunds = initialFunds;
//    }

    public String getAllocatedTo() {
        return allocatedTo;
    }

    public void setAllocatedTo(String allocatedTo) {
        this.allocatedTo = allocatedTo;
    }

    
    
}
