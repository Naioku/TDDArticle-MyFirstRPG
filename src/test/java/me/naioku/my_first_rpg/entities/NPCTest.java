package me.naioku.my_first_rpg.entities;

import me.naioku.my_first_rpg.helpers.Coordinates;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NPCTest {

    @Test
    void movingNorthShouldAddSpecificValueToYCoordinate() {
        // given
        NPC npc = new NPC(new Coordinates(0, 0), 100);

        // when
        npc.moveNorth(5);

        // then
        assertThat(npc.getCoordinates()).isEqualTo(new Coordinates(0, 5));
    }

    @Test
    void movingSouthShouldSubtractSpecificValueFromYCoordinate() {
        // given
        NPC npc = new NPC(new Coordinates(0, 0), 100);

        // when
        npc.moveSouth(5);

        // then
        assertThat(npc.getCoordinates()).isEqualTo(new Coordinates(0, -5));
    }

    @Test
    void movingWestShouldAddSpecificValueToXCoordinate() {
        // given
        NPC npc = new NPC(new Coordinates(0, 0), 100);

        // when
        npc.moveWest(5);

        // then
        assertThat(npc.getCoordinates()).isEqualTo(new Coordinates(5, 0));
    }

    @Test
    void movingEastShouldSubtractSpecificValueFromXCoordinate() {
        // given
        NPC npc = new NPC(new Coordinates(0, 0), 100);

        // when
        npc.moveEast(5);

        // then
        assertThat(npc.getCoordinates()).isEqualTo(new Coordinates(-5, 0));
    }
}