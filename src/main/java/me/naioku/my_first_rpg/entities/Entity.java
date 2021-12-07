package me.naioku.my_first_rpg.entities;

import me.naioku.my_first_rpg.helpers.Coordinates;

public abstract class Entity {

    Coordinates coordinates;
    double health;

    public Entity(Coordinates coordinates, double health) {
        this.coordinates = coordinates;
        this.health = health;
    }

    public void moveNorth(double distance) {
        coordinates.setY(coordinates.getY() + distance);
    }

    public void moveSouth(double distance) {
        coordinates.setY(coordinates.getY() - distance);
    }

    public void moveWest(double distance) {
        coordinates.setX(coordinates.getX() + distance);
    }

    public void moveEast(double distance) {
        coordinates.setX(coordinates.getX() - distance);
    }

    public Coordinates getCoordinates() {
        return coordinates;
    };

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }
}
