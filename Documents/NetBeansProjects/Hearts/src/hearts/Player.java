/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hearts;

/**
 *
 * @author nzs52
 */
public class Player {

    private String my_name;
    private Cards[] myHand = new Cards[13];
    private int points;

    public Player(String my_name, Cards[] myHand) {
        this.my_name = my_name;
        this.myHand = myHand;
        this.points = 0;
    }

    public String getMy_name() {
        return my_name;
    }

    public void addPoints(int points) {
        this.points += points;
    }

    public void reducePoints(int points) {
        this.points -= points;
    }

    public int getPoints() {
        return points;
    }

    public Cards[] getMyHand() {
        return myHand;
    }

    public void setMyHand(Cards[] myHand) {
        this.myHand = null;
        this.myHand = myHand;

        for (Cards cards : myHand) {
            cards.setOwner(my_name);
            cards.setUsableCard(true);
        }
    }

    public void get3Cards(Cards[] myHand) {

        for (Cards cards : myHand) {
            cards.setOwner(my_name);
            cards.setUsableCard(true);
        }
    }
    
    public void remove3Cards(Cards[] removeCards) {

        int count = 0;
        for (Cards removeC : removeCards) {
            for (int i = 0; i < myHand.length; i++) {
                if (myHand[i].getValue() ==removeC.getValue()) {
                    count++;
                    myHand[i].equals(null);
                    break;
                }
            }
        }
        if(count !=3) {
            System.out.println("Error removing 3 cards" + count);
        }
    }
    
    public Boolean isFirstPlayer() {
        for (Cards cards : myHand) {
            if (cards.isClubs2()) {
                return true;
            }
        }
        return false;
    }
    
    //public void update_rule(Boolean)
}
