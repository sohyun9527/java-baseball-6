package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class UserInput {
    Validation validation = new Validation();
    String getUserInput() {
        return Console.readLine();
    }

    List<Integer> makeUserInputToThreeNumbers() {
        List<Integer> result = new ArrayList<>();
        String trimmedInput = getUserInput().strip();

        validation.validateThreeNumbers(trimmedInput);
        for (int i = 0; i < trimmedInput.length(); i++) {
            result.add(trimmedInput.charAt(i) - '0');
        }
        return new ArrayList<>(result);
    }
}
