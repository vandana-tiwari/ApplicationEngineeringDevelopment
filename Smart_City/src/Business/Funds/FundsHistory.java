/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Funds;

import java.util.ArrayList;

/**
 *
 * @author vanda
 */
public class FundsHistory {
    private static int initialMayorFunds = 10000;
  
    private ArrayList<Fund> transactionsHist;

    public int getInitialMayorFunds() {
        return initialMayorFunds;
    }

    public void setInitialMayorFunds(int initialMayorFunds) {
        FundsHistory.initialMayorFunds = initialMayorFunds;
    }
    
    public FundsHistory(){
        transactionsHist = new ArrayList<>();
    }

    public ArrayList<Fund> getTransactionsHist() {
        return transactionsHist;
    }

    public void setTransactionsHist(ArrayList<Fund> transactionsHist) {
        this.transactionsHist = transactionsHist;
    }
    
    public void addTransaction(String allocatedTo, float closingBal){
        Fund f = new Fund();
        f.setAllocatedTo(allocatedTo);
        f.setDate();
        f.setClosingBalance(closingBal);
        transactionsHist.add(f);
    }
}
