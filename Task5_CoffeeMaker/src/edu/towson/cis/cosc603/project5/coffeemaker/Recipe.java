/*
 * 
 */
package edu.towson.cis.cosc603.project5.coffeemaker;

/**
 * Recipe object for the coffee maker
 * @author Josh
 * @version $Revision: 1.0 $
 */
public class Recipe {
    private String name;
    private int price;
    private int amtCoffee;
    private int amtMilk;
    private int amtSugar;
    private int amtChocolate;
    
    /**
     * Method getAmtChocolate.
     * @return int
     */
    public int getAmtChocolate() {
        return amtChocolate;
    }
    /**
     * Method setAmtChocolate.
     * @param amtChocolate int
     */
    public void setAmtChocolate(int amtChocolate) {
    	if(amtChocolate >= 0) {
    		this.amtChocolate = amtChocolate;
    	}
    	else {
    		this.amtChocolate = 0;
    	}
    }
    /**
     * Method getAmtCoffee.
     * @return int
     */
    public int getAmtCoffee() {
        return amtCoffee;
    }
    /**
     * Method setAmtCoffee.
     * @param amtCoffee int
     */
    public void setAmtCoffee(int amtCoffee) {
    	if(amtCoffee >= 0) {
    		this.amtCoffee = amtCoffee;
    	}
    	else {
    		this.amtCoffee = 0;
    	}
    }
    /**
     * Method getAmtMilk.
     * @return int
     */
    public int getAmtMilk() {
        return amtMilk;
    }
    /**
     * Method setAmtMilk.
     * @param amtMilk int
     */
    public void setAmtMilk(int amtMilk) {
    	if(amtMilk >= 0) {
    		this.amtMilk = amtMilk;
    	}
    	else {
    		this.amtMilk = 0;
    	}
    }
    /**
     * Method getAmtSugar.
     * @return int
     */
    public int getAmtSugar() {
        return amtSugar;
    }
    /**
     * Method setAmtSugar.
     * @param amtSugar int
     */
    public void setAmtSugar(int amtSugar) {
    	if(amtSugar >= 0) {
    		this.amtSugar = amtSugar;
    	}
    	else {
    		this.amtSugar = 0;
    	}
    }
    /**
     * Method getName.
     * @return String
     */
    public String getName() {
        return name;
    }
    /**
     * Method setName.
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Method getPrice.
     * @return int
     */
    public int getPrice() {
        return price;
    }
    /**
     * Method setPrice.
     * @param price int
     */
    public void setPrice(int price) {
    	if(price >= 0) {
    		this.price = price;
    	}
    	else {
    		this.price = 0;
    	}
    } 
    /**
     * Method equals.
     * @param r Recipe
     * @return boolean
     */
    public boolean equals(Recipe r) {
        if(r.getName() == null) {
	    	return false;
    	}	
        if(this.name == null) {
        	return false;
        }
        if((this.name).equals(r.getName())) {
            return true;
        }
        return false;
    }
    /**
     * Method toString.
     * @return String
     */
    public String toString() {
    	return name;
    }
	/**
	 * Returns true if a recipe is successfully added to the 
	 * coffee maker
	 * @param coffeeMaker TODO
	 * @return boolean */
	public boolean addRecipe(CoffeeMaker coffeeMaker) {
	    boolean canAddRecipe = true;
	        
	    //Check if the recipe already exists
	    for(int i = 0; i < coffeeMaker.NUM_RECIPES; i++) {
	        if(equals(coffeeMaker.getRecipeArray()[i])) {
	            canAddRecipe = false;
	        }
	    }
	    
	    return emptyRecipe(coffeeMaker, canAddRecipe);
	}
	private boolean emptyRecipe(CoffeeMaker coffeeMaker, boolean canAddRecipe) {
		//Check for an empty recipe, add recipe to first empty spot
	    if(canAddRecipe) {
	    	int emptySpot = -1;
	    	for(int i = 0; i < coffeeMaker.NUM_RECIPES; i++) {
	    		if(!coffeeMaker.getRecipeFull()[i]) {
	    			emptySpot = i;
	    			canAddRecipe = true;
	    		}
	    	}
	    	if(emptySpot != -1) {
	    		coffeeMaker.getRecipeArray()[emptySpot] = this;
	    		coffeeMaker.getRecipeFull()[emptySpot] = true;
	    	}
	    	else {
	    		canAddRecipe = false;
	    	}
	    }
	    return canAddRecipe;
	}
}