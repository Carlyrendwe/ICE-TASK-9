/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.joptionpaneactivity;
import javax.swing.*;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class JOptionPaneActivity {

    public static void main(String[] args) {
        
        Calculator calculate = new Calculator();
        double num1, num2;
        int option;

        // Get the input numbers from the user
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number:"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number:"));

        // While loop to keep the program running until the user chooses to exit
        do {
            // Display the menu
            String menu = "Choose an operation:\n"
                        + "1. Add\n"
                        + "2. Subtract\n"
                        + "3. Multiply\n"
                        + "4. Divide\n"
                        + "0. Exit";
            option = Integer.parseInt(JOptionPane.showInputDialog(menu));

            // Switch case to handle different operations
            switch (option) {
                case 1:
                    double sum = calculate.add(num1, num2);
                    JOptionPane.showMessageDialog(null, "Result: " + sum);
                    break;
                case 2:
                    double difference = calculate.subtract(num1, num2);
                    JOptionPane.showMessageDialog(null, "Result: " + difference);
                    break;
                case 3:
                    double product = calculate.multiply(num1, num2);
                    JOptionPane.showMessageDialog(null, "Result: " + product);
                    break;
                case 4:
                    double quotient = calculate.divide(num1, num2);
                    JOptionPane.showMessageDialog(null, "Result: " + quotient);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Exiting the program.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please choose again.");
            }
        } while (option != 0); // Exit when the user enters 0
    }
        
               
    }

