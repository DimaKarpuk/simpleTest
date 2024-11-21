import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {
    @BeforeAll
    public static void beforeAll() {
        Configuration.baseUrl = "https://stepik.org/";
        Configuration.headless = true;

    }
}
