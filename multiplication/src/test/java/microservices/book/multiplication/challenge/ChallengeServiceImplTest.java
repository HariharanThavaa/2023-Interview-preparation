package microservices.book.multiplication.challenge;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class ChallengeServiceImplTest {

    private ChallengeService challengeService;

    @BeforeEach
    public void setUp(){
        challengeService = new ChallengeServiceImpl();
    }

    @Test
    public void checkCorrectAttemptTest(){
        // given
        ChallengeAttemptDTO challengeAttemptDTO = new ChallengeAttemptDTO(50, 60, "Hariharan", 3000);

        // when
        ChallengeAttempt challengeAttempt = challengeService.verifyAttempt(challengeAttemptDTO);

        //then
        then(challengeAttempt.isCorrect()).isTrue();
    }

    @Test
    public void checkWrongAttemptTest(){
        // given
        ChallengeAttemptDTO challengeAttemptDTO = new ChallengeAttemptDTO(50, 60, "Hariharan", 5000);

        // when
        ChallengeAttempt challengeAttempt = challengeService.verifyAttempt(challengeAttemptDTO);

        //then
        then(challengeAttempt.isCorrect()).isFalse();
    }
}