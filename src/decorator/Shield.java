/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author tim
 */
public class Shield extends CharacterDecorator {
    
     public Shield(Character character) {
        super(character);
    }

    @Override
    public String getName() {
        return character.getName() + " , Shield Handler";
    }

    @Override
    public double getMight() {
        return character.getMight() + 20;
    }
    
}
