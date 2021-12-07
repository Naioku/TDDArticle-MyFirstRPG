package me.naioku.my_first_rpg.weapons;

import me.naioku.my_first_rpg.entities.Entity;
import me.naioku.my_first_rpg.services.DistanceService;

public class LongSword {

    double attackDamage = 10;
    DistanceService distanceService;

    public LongSword(DistanceService distanceService) {
        this.distanceService = distanceService;
    }

    public void attack(Entity entity) {
        if (distanceService.isDistanceSufficient()) {
            entity.setHealth(entity.getHealth() - attackDamage);
        }
    }
}
