package me.naioku.my_first_rpg.weapons;

import me.naioku.my_first_rpg.entities.NPC;
import me.naioku.my_first_rpg.helpers.Coordinates;
import me.naioku.my_first_rpg.services.DistanceService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
// import static org.mockito.Mockito.when;

class LongSwordTest {
    @Test
    void targetShouldBeDamagedWithProperValueWhenDistanceIsSufficient() {
        // given
        DistanceService distanceService = mock(DistanceService.class);
        LongSword longSword = new LongSword(distanceService);
        NPC npc = new NPC(new Coordinates(0, 5), 100);
        given(distanceService.isDistanceSufficient()).willReturn(idDistanceSufficient());
        // lub
        // when(distanceService.isDistanceSufficient()).thenReturn(idDistanceSufficient());

        // when
        longSword.attack(npc);

        // then
        assertThat(npc.getHealth()).isEqualTo(100 - 10);
    }

    private boolean idDistanceSufficient() {
        return true;
    }
}