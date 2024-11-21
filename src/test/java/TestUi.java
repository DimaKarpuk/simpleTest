import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class TestUi extends TestBase{

    @Test
    public void simpleTest(){
     step("open main page", ()->{
         open("");
     });
     step("input value", ()->{
         $(".search-form__input ").setValue("sql").pressEnter();
     });
    }
}
