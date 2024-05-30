package homework34;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnimalsActions {


    private final int eatEnergyIncrement = 20;
    private final int sleepEnergyIncrement = 30;
    private final int playEnergyDecrement = 40;

    private static final Logger LOGGER = LoggerFactory.getLogger(AnimalsActions.class);

    public int eat(Animal animal) {
        LOGGER.info("Feeding the animal");
        animal.setEnergy(animal.getEnergy() + eatEnergyIncrement);
        LOGGER.debug("The animal " + animal.getName() + " has eaten and its energy is now: " + animal.getEnergy());
        return animal.getEnergy();
    }

    public int sleep(Animal animal) {
        LOGGER.info("Animal sleep");
        animal.setEnergy(animal.getEnergy() + sleepEnergyIncrement);
        LOGGER.debug("The animal " + animal.getName() + " slept and its energy is now: " + animal.getEnergy());
        return animal.getEnergy();
    }

    public int play(Animal animal) {
        if (animal.getEnergy() >= 40) {
            LOGGER.info("Animal play");
            animal.setEnergy(animal.getEnergy() - playEnergyDecrement);
            LOGGER.debug("The animal " + animal.getName() + " played and its energy is now:" + animal.getEnergy());
            if (animal.getEnergy() == 0) {
                LOGGER.warn("The animal is tired and needs rest");
            } return animal.getEnergy();
        } else{
            LOGGER.warn("The animal is tired and needs rest");
        }
        return animal.getEnergy();
    }
}
