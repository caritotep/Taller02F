package testCases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.loginModal;
import singletonSession.Session;

public class Logintodoist {

    MainPage mainPage = new MainPage();
    loginModal LoginModal = new loginModal();

    @BeforeEach
    public void Before() {
        Session.getSession().getDriver().get("https://todoist.com/");
    }
    @AfterEach
    public void After(){
        Session.getSession().closeSession();
    }
    @Test
    public void verifyTheLogin () throws InterruptedException {
        mainPage.loginButton.click();
        LoginModal.emailTxt.fillText("jbowasp57@jbowasp57.com");
        LoginModal.passwordTxt.fillText("21Carolina25");
        LoginModal.loginButon.click();
        Thread.sleep(2000);
        Assertions.assertFalse(LoginModal.loginButon.isControlDisplayed(),"ERROR");
    }


}
