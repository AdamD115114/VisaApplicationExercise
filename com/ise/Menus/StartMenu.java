package com.ise.Menus;

import java.util.Scanner;

import com.ise.Interface.Menu;

/**
 * StartMenu
 */
public class StartMenu implements Menu{

    private Scanner userInput;
    private String[] displayOptions; 
    private int option = -1;
    public StartMenu(String[] menuOptions) {
        this.displayOptions = menuOptions;
        this.userInput = new Scanner(System.in);
    }
    @Override
    public void display() {
        String temp = "";
        System.out.println("Welcome to the System\n Please choose the option that like");
        for(int i = 0; i< displayOptions.length; i++){
            System.out.println("[" + i + "] " + displayOptions[i]);
        }
        option = userInput.nextInt();
        System.out.flush();
    }
    @Override
    public boolean isValidResponse() {
        if(option >= 0 && option <= (displayOptions.length - 1)){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public int getSelection() {
        return option;
    }
    @Override
    public String getOption() {
        if(this.isValidResponse()){
            return displayOptions[option];
        }else{
            return "Invalid option choosen";
        }
    }

}