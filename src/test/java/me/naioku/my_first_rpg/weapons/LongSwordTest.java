package me.naioku.my_first_rpg.weapons;

import me.naioku.my_first_rpg.entities.NPC;
import me.naioku.my_first_rpg.helpers.Coordinates;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongSwordTest {
    @Test
    void targetShouldBeDamagedWithProperValueWhenDistanceIsSufficient() {
        // given
        LongSword longSword = new LongSword(new DistanceServiceStub());
        NPC npc = new NPC(new Coordinates(0, 5), 100);

        // when
        longSword.attack(npc);

        // then
        assertThat(npc.getHealth()).isEqualTo(100 - 10);
    }
}