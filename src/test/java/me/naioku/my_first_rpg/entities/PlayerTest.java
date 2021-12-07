package me.naioku.my_first_rpg.entities;

import me.naioku.my_first_rpg.helpers.Coordinates;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlayerTest {

    @Test
    void movingNorthShouldAddSpecificValueToYCoordinate() {
        // given
        Player player = new Player(new Coordinates(0, 0), 100);

        // when
        player.moveNorth(5);

        // then
        assertThat(player.getCoordinates()).isEqualTo(new Coordinates(0, 5));
    }

    @Test
    void movingSouthShouldSubtractSpecificValueFromYCoordinate() {
        // given
        Player player = new Player(new Coordinates(0, 0), 100);

        // when
        player.moveSouth(5);

        // then
        assertThat(player.getCoordinates()).isEqualTo(new Coordinates(0, -5));
    }

    @Test
    void movingWestShouldAddSpecificValueToXCoordinate() {
        // given
        Player player = new Player(new Coordinates(0, 0), 100);

        // when
        player.moveWest(5);

        // then
        assertThat(player.getCoordinates()).isEqualTo(new Coordinates(5, 0));
    }

    @Test
    void movingEastShouldSubtractSpecificValueFromXCoordinate() {
        // given
        Player player = new Player(new Coordinates(0, 0), 100);

        // when
        player.moveEast(5);

        // then
        assertThat(player.getCoordinates()).isEqualTo(new Coordinates(-5, 0));
    }

}