package testTodoLy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.todoLy.LoginSection;
import pages.todoLy.MainPage;
import pages.todoLy.MenuSection;
import singletonSession.Session;

public class TestBase {

    protected MainPage mainPage = new MainPage();
    protected LoginSection loginSection = new LoginSection();
    protected MenuSection menuSection = new MenuSection();

    @BeforeEach
    public void openBroswer() {
        Session.getSession().goTo("https://todo.ly/");
    }

    @AfterEach
    public void closeBroswer() {

        Session.getSession().closeBrowser();

    }

}
