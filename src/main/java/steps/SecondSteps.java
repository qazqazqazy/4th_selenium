package steps;

import io.qameta.allure.Step;
import pages.SecondPage;

import static junit.framework.TestCase.assertTrue;

public class SecondSteps {

    @Step("Выполнено нажатие на кнопку - Оформить заявку")
        public void stepSendAppButton(){
            new SecondPage(BaseSteps.getDriver()).sendButton.click();
    }

    @Step("Проверка наличия текста 'до 120 000 евро'")
        public void stepAssertTrueSec(){
        String text = "до 120 000 евро";
        String link = new SecondPage(BaseSteps.getDriver()).search_text.getText();
        assertTrue(text.equals(link));
    }

}
