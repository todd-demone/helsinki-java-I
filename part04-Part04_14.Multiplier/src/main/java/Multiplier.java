/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toddd
 */
public class Multiplier {
    private int firstNumber;
    
    public Multiplier(int firstNumber) {
        this.firstNumber = firstNumber;
    }
    
    public int multiply (int secondNumber) {
        return this.firstNumber * secondNumber;
    }
}
