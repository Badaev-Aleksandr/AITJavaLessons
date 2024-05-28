package lesson35;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class Zoo {
    private static final Logger LOGGER = LoggerFactory.getLogger(Zoo.class);
    Map<String, Animal> animalMap = new HashMap();

    public void addAnimal(Animal animal) {
        if (animal==null){
            LOGGER.error("Ошибка при добавлении животного, равно null");
        }else {
            animalMap.put(animal.getName(), animal);
        }
    }

    public void checkAnimals() {
        for (Animal animal : animalMap.values()) {
            LOGGER.info("Имя животного {}. Его энергия {} ", animal.getName(), animal.getEnergy());
        }
    }
}
