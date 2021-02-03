/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jarfile;

import javax.swing.*;

/**
 *
 * @author user
 */
public class Main   {
public static void main(String[] args) {
         Multiplication table = new Multiplication();
        table.setVisible(true);
        table.setBounds(300,400, 540,900);
        //
        table.setResizable(false);
        table.setTitle("MULTIPLICATION TABLE");
    }

}




