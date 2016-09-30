package objects;

/**
 * Created by nxtlvl on 9/28/2016.
 */
public class Animal {

    public String getNameOfSpecies() {
        return nameOfSpecies;
    }

    public void setNameOfSpecies(String nameOfSpecies) {
        this.nameOfSpecies = nameOfSpecies;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }


    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }



    private String nameOfSpecies;
    private boolean isAlive;
    private int lifeSpan;
}
