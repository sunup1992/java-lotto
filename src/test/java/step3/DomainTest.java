package step3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DomainTest {
    @Test
    @DisplayName("전체 도메인 테스트")
    void MainTest(){
        int money = 10000;
        FixedNumberGenerator fixedWinningsGenerator = new FixedNumberGenerator();
        fixedWinningsGenerator.setNumber("1,3,5,7,10,12");

        Lottos lottos = Main.settingLottos(money, fixedWinningsGenerator);

        ResultNumber.settingLottoResultNumber("1, 3, 5, 7, 10, 11");
        ResultNumber.settingLottoBonusNumber("12");

        lottos.checkResult();

        // 결과 출력
        ResultView.printResult(money);
    }
}
