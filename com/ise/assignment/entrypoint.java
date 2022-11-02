package com.ise.assignment;

import com.ise.Menus.StartMenu;

public class entrypoint {

 public static void main(String[] args) {
    String[] options = {"option 1", "option 2", "option 3"};
    StartMenu menu = new StartMenu(options);
    while(!menu.isValidResponse()){
        menu.display();
    }
    int op = menu.getSelection();
    System.out.println("The option selected was: " + op + " and hat cooresponded to the option: " + menu.getOption());
 }   
}