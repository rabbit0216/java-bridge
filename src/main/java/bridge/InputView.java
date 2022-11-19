package bridge;

import static bridge.Constants.*;
import static camp.nextstep.edu.missionutils.Console.readLine;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        String tempBridgeSize = readLine();
        bridgeValidate(tempBridgeSize);
        int bridgeSize = Integer.parseInt(tempBridgeSize);
        return bridgeSize;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        return null;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }

    void bridgeValidate(String bridgeSize){
        if(!isNumber(bridgeSize)){
            System.out.println(ERROR_PREFIX + BRIDGE_ERROR);
            throw new IllegalArgumentException(ERROR_PREFIX + BRIDGE_ERROR);
        }
        int convertedBridgeSize = Integer.parseInt(bridgeSize);
        if(convertedBridgeSize < 3 || convertedBridgeSize > 20){
            System.out.println(ERROR_PREFIX + BRIDGE_ERROR);
            throw new IllegalArgumentException(ERROR_PREFIX + BRIDGE_ERROR);

        }
    }

    boolean isNumber(String bridgeSize){
        boolean answer = true;
        for(int idx = 0; idx < bridgeSize.length(); idx++){
            if(!Character.isDigit(bridgeSize.charAt(idx))){
                answer = false;
            }
        }
        return answer;
    }
}
