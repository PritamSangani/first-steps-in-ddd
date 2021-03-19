package com.harmellaw;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class APreChargeDecision {

    @BeforeEach
    public void setup() {
    }

    @Test
    public void shouldRecordAlternativeOffenceAdviceAgainstSuspects() {
        Suspect suspect = new Suspect(CriminalOffence.CUTTING_AWAY_BUOYS_ETC);
        PreChargeDecision aPreChargeDecision = new PreChargeDecision();
        OffenceAdvice offenceAdvice = new OffenceAdvice();

        aPreChargeDecision.recordAlternativeOffenceAdvice(suspect, offenceAdvice);

        assertEquals(offenceAdvice, aPreChargeDecision.getOffenceAdviceFor(suspect));
    }

}
