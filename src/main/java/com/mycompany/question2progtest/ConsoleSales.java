/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2progtest;

/**
 *
 * @author naike
 */
public class ConsoleSales extends Console implements IConsoles{
    
    /**
     *
     * @param consoleType
     * @param Store
     * @param totalSales
     */
    public ConsoleSales(String consoleType, String store, int totalSales ) {
    
    super(consoleType, store, totalSales);
    
}

    ConsoleSales(String pS5, String number_1, String electronics, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void printReport() {
        System.out.println("----------------------------------------------------");
        System.out.println("\nCONSOLE SALES REPORT");
        System.out.println("\n-----------------------------------------------------");
        
     
        System.out.println("Console Type: " + getConsoleType());
        
        System.out.println("Store name: " + getStore());
        
        System.out.println("Total Sales: " + getTotalSales());
        
        System.out.println("-----------------------------------------------------");
    }
}
