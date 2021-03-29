import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class lid_test_page {
    public WebDriver driver;
    public WebDriverWait wait;
    public InterruptedException sleep;


    public lid_test_page(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get("https://lgcity.ru/");
    }

    @FindBy(xpath = "//div[@id=\"menu-326\"]")
    private WebElement mens;

    public void mensClick() {
        mens.click();
    }

    @FindBy(xpath = "//*[@id=\"menu-333\"]")
    private WebElement shoes;

    By xpathMensShoes = By.xpath("//h1[contains(text(),\"Мужская обувь\")]");

    public void shoesClick() {
        shoes.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpathMensShoes));
    }

    @FindBy(xpath = "//label[@id=\"favorite-715228\"]")
    private WebElement add_favorite;

    public void favoriteClick() {
        add_favorite.click();
    }

    @FindBy(xpath = "//div[@id=\"products-list\"]/a[@id=\"bx_1118835136_715229\"]")
    private WebElement product_card;

    public void product_cardClick() {
        product_card.click();
    }

    @FindBy(xpath = "//button[@id=\"btn-add-to-cart\"]")
    private WebElement add_cart;

    public void add_cartClick() throws InterruptedException {
        add_cart.click();
        Thread.sleep(5000);
    }

    @FindBy(xpath = "//a[@id=\"menu-333\"]")
    private WebElement back_shoes;

    public void back_shoesClick() {
        back_shoes.click();
    }

    @FindBy(xpath = "//a[@class=\"header__r-icons-link header__r-icons-link--search js-popup\"]")
    private WebElement search;

    public void searchOpen() throws InterruptedException {
        search.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(), 'Что вы хотите найти?')]")));
        // Thread.sleep(5000);
    }

    @FindBy(xpath = "//div[@class=\"input input--default header__search-input autocomplete\"]/input[@class=\"input__input\"]")
    private WebElement text;

    public void inputtext() {
        driver.findElement(By.xpath("//button[@class=\"header__search-button\"]/following-sibling::div/input")).sendKeys("кеды");


    }

    // @FindBy(xpath = "//div[@class=\"input input--default header__search-input autocomplete\"]/input[@class=\"input__input\"]")
    // private WebElement textDich;

    //public void inputtextDich() {
    //  driver.findElement(By.xpath("//button[@class=\"header__search-button\"]/following-sibling::div/input")).sendKeys("%%%$$");
    //}

    @FindBy(xpath = "//button[@class=\"header__search-button\"]")
    private WebElement to_push_search;

    public void pushsearch() {
        to_push_search.click();
    }

    @FindBy(xpath = "//div[@id=\"products-list\"]")
    private WebElement cardsPage;

    public void cardsInPage() {
        int amountCardsInPage = driver.findElements(By.xpath("//div[@class='catalog__item-price']")).size();
        if (amountCardsInPage > 0) {
            System.out.println("ok");
        } else {
            System.out.println("false");
        }
    }


    //@FindBy(xpath = "//button[@class=\"header__search-button\"]")
    //private WebElement cardsPagezero;

    //public void cardsInPagezero() {
    //  int amountCardsInPage = driver.findElements(By.xpath("//div[@class='catalog__item-price']")).size();
    //if (amountCardsInPage == 0) {
    //  System.out.println("oK");
    // } else {
    //   System.out.println("false");
    // }

    // }
    @FindBy(xpath = "//div[@class=\"header__reg js-popup hide-def-scroll\"]")
    private WebElement city;
    public void openCity (){
        city.click();

    }
    @FindBy(xpath = "//a[contains(text(), \"Новосибирск\")]")
    private WebElement change;
    public void changeCity() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"locate__popular-list\"]")));
        change.click();
    }

    @FindBy(xpath = "//a[@id=\"btn-save-user-locate\"]")
    private WebElement city1;
    public void saveCity(){
        city1.click();
    }
    //@FindBy(xpath = "//div[@class=\"header__reg js-popup hide-def-scroll\"]/div[contains(text(), \"Новосибирск\")]")

    public void cityInPage(){
        String city11 = driver.findElement(By.xpath("//div[@class=\"header__reg js-popup hide-def-scroll\"]/div[contains(text(), \"Новосибирск\")]")).getText();
        System.out.println(city11);
        String city33 = "Новосибирск";
        Assert.assertEquals(city11,city33);
    }
    @FindBy(xpath = "//div[@class=\"input input--with-button footer__input\"]")
    private WebElement subscribe;
    public void emailSubscribe(){
        driver.findElement(By.xpath("//div[@class= \"input input--with-button footer__input\"]/input[@class=\"input__input\"]" +
                "")).sendKeys("igor@mail.ru");
    }

    @FindBy(xpath = "//button[@id=\"subscribe-submit\"]")
    private WebElement validationEmail;
    public void emailValidation(){
        validationEmail.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class=\"ui-input__success ui-input__validation\"]")));
        System.out.println("E-mail валиден!");

    }



}

