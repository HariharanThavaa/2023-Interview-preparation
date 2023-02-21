package microservices.book.multiplication.challenge;

public interface ChallengeService {
    /**
     * Verifies if an attempt coming from the presentation layer is correct or not.
     * @param resultAttempt
     * @return the resulting ChallengeAttempt Object.
     */
    ChallengeAttempt verifyAttempt(ChallengeAttemptDTO resultAttempt);
}
