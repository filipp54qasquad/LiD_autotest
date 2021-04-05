import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class lid_test_page {
    public WebDriver driver;
    public WebDriverWait wait;
    public InterruptedException sleep;
    String str;


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
    /**
     * для второго теста(добавление товара, оформление заказа)
     */
    @FindBy(xpath = "//a[@id=\"menu-340\"]")
    private WebElement clothes;

    public void allClothes() {
        //  ((JavascriptExecutor) driver).executeScript("scroll(0,400);");
        clothes.click();
    }

    @FindBy(xpath = "//div[@id=\"products-list\"]/a[1]")
    private WebElement open;

    public void openCard() {
        open.click();
    }

    @FindBy(xpath = "//button[@id=\"btn-add-to-cart\"]")
    private WebElement add;

    public void addBasket() {
        add.click();
    }

    @FindBy(xpath = "//a[@id=\"header-basket\"]")
    private WebElement basket;

    public void openBasket() {
        basket.click();
    }

    @FindBy(xpath = "//button[@class=\"button button--fill basket__button\"]")
    private WebElement order;

    public void orderPage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class=\"button button--fill basket__button\"]")));
        order.click();
    }
    // private WebElement clothes1 = driver.findElement(By.xpath("//a[@id=\"menu-340\"]"));
    // public void clothesOpen(){
    //    Actions actions = new Actions(driver);
    //    actions.moveToElement(clothes1).perform();

    //  }
    @FindBy(xpath = "//button[@class=\"button button--ghost btn-full\"]")
    private WebElement auth;

    public void nextAuth() {
        auth.click();
    }


    public void button() {
        String str = driver.findElement(By.xpath("//button[contains(text(), 'Оформить заказ')]")).getAttribute("disabled");
        if (str.equals("true")) {
            System.out.println("Кнопка не активна!");
        } else {
            System.out.println("Кнопка активна!");
        }
    }

    private WebElement text1;

    public void textName() {
        driver.findElement(By.xpath("//div[@class=\"cart__form js-cart-form\"]//input[1]")).sendKeys("Иван");
    }

    private WebElement text2;

    public void lastName() {
        driver.findElement(By.xpath("//div[contains(text(), \"Получатель\")]/../self::div/following-sibling::div//label[contains(text(), \"Фамилия\")]/following-sibling::input")).sendKeys("Батько");

    }

    private WebElement text3;

    public void emailInput() {
        driver.findElement(By.xpath("//div[contains(text(), \"Получатель\")]/../self::div/following-sibling::div//label[contains(text(), \"E-mail\")]/following-sibling::input")).sendKeys("igor@mail.ru");
    }

    private WebElement text4;

    public void phoneNumber() {
        driver.findElement(By.xpath("//div[contains(text(), \"Получатель\")]/../self::div/following-sibling::div//label[contains(text(), \"Телефон\")]/following-sibling::input")).click();
        driver.findElement(By.xpath("//div[contains(text(), \"Получатель\")]/../self::div/following-sibling::div//label[contains(text(), \"Телефон\")]/following-sibling::input")).sendKeys("9994504374");
    }

    private WebElement address;

    public void addressInput() {
        driver.findElement(By.xpath("//div[contains(text(),\"АДРЕС\")]/../self::div/following-sibling::div//label[contains(text(), \"Населенный пункт\")]/following-sibling::input")).sendKeys("Новосибирск");

    }

    @FindBy(xpath = "//li[@class=\"selected-city\"]")
    private WebElement change2;

    public void selectCity() throws InterruptedException {
        change2.click();
        //  Thread.sleep(3000);
    }

    @FindBy(xpath = "//div[contains(text(), \"СПОСОБ ДОСТАВКИ\")]/following::div[@class=\"delivery-methods\"]/a[2]")
    private WebElement delivery;

    public void deliveryMethod() {
        ((JavascriptExecutor) driver).executeScript("scroll(0,400);");
        //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), \"СПОСОБ ДОСТАВКИ\")]/following::div[@class=\"delivery-methods\"]/a[2]")));
        delivery.click();

    }

    @FindBy(xpath = "//a[@class=\"button button--ghost button--block js-popup\"]")
    private WebElement select;

    public void selectChange() {
        select.click();
        // driver.findElement(By.xpath("//span[contains(text(), \"Самовывоз\")]/ancestor::a")).click();
        //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class=\"button button--ghost button--block js-popup\"]")));

    }

    @FindBy(xpath = "//div[@class=\"delivery-points__contents\"]//div[@style=\"height: 18725px; width: 100%;\"]/div[1]")
    private WebElement pvz;

    public void selectpvz() {
        pvz.click();
    }

    @FindBy(xpath = "//a[contains(text(), \"Выбрать этот пункт\")]")
    private WebElement confirmation;

    public void confirmationSelect() {
        confirmation.click();
    }

    private WebElement comment;

    public void commentText() {
        driver.findElement(By.xpath("//textarea[@placeholder=\"Комментарий к заказу...\"]")).sendKeys("Тестовый заказ");
    }

    @FindBy(xpath = "//div[contains(text(),\"Наличными\")]/../div[@class=\"radio__custom\"]")
    private WebElement payment;

    public void paymentmethod() {
        payment.click();
    }


    @FindBy(xpath = "//div[contains(text(), \"Звонок оператора\")]")
    private WebElement confirmationorder;

    public void confirmationorder() {
        confirmationorder.click();
    }


    public void buttonordermake() {
        //  String str = driver.findElement(By.xpath("//button[contains(text(), 'Оформить заказ')]")).getAttribute("disabled");
        str = driver.findElement(By.xpath("//button[contains(text(), 'Оформить заказ')]")).getAttribute("disabled");
        if (str != null) {
            System.out.println("Кнопка не активна!");
        } else {
            System.out.println("Кнопка активна!");
        }
    }
    /**
     * Третий тест(добавление, удаление товара из корзины, редактирование количества товара в корзине)
     */

    //  public void randomAddClothes(){
    //     driver.findElement(By.xpath("//div[@id=\"products-list\"]/a[1]//div[contains(text(), \"Добавить\")]")).click();
    //    driver.findElement(By.xpath("//div[@class=\"catalog__quick-buy-list\"]/button[1]")).click();
//

    // }
    /**
     * Закрытие куки
     **/
    @FindBy(xpath = "//button[@id=\"confirm-use-cookies\"]")
    private WebElement cookie;

    public void closecookie() {
        //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\"confirm-use-cookies\"]'")));
        cookie.click();
    }

    /**
     * --
     **/
    int kolichestvo;

    public void randomClothes() throws InterruptedException {
        int counter = 0;
        List<WebElement> cardList = driver.findElements(By.xpath("//a[@class=\"catalog__item owox-catalog-list\"]"));
        Random random = new Random();
        int CardAmount = random.nextInt(cardList.size()) + 1;
        System.out.println(CardAmount);

        //  driver.findElement(By.xpath("(//a[@class=\"catalog__item owox-catalog-list\"])["+ CardAmount +"]")).click();
        //  add.click();
        //   counter++;
        for (int i = 1; i <= 5; i++) {
            driver.findElement(By.xpath("(//a[contains(@class,\"header__nav-list-link\")])[" + i + "]")).click();
            kolichestvo = driver.findElements(By.xpath("//a[@class=\"catalog__item owox-catalog-list\"]")).size();
            int randomkolichestvo = random.nextInt(kolichestvo) + 1;
            System.out.println(kolichestvo + " " + randomkolichestvo);
            driver.findElement(By.xpath("(//a[@class=\"catalog__item owox-catalog-list\"])[" + randomkolichestvo + "]")).click();
            add.click();
            counter++;
        }
        basket.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"js-basket-total-price\"]")));
        int basket4 = driver.findElements(By.xpath("//div[@class=\"basket__item-content\"]")).size();
        //   System.out.println(counter == basket4.size());
        if (counter == basket4) {
            System.out.println("Количество товаров в корзине совпадает!");
        } else {
            System.out.println("Количество товаров в корзине не совпадает!");
        }


    }

    /**
     * Тест 4, сортировка
     */

    private WebElement sorting;

    public void sortingprice() {
        driver.findElement(By.xpath("//div[@class=\"catalog__sort-list\"]")).click();
    }

    private WebElement select1;

    public void selectprice() {
        driver.findElement(By.xpath("//div[@class=\"catalog__sort-list\"]/button[contains(text(), \"По возрастанию цены ↓\")]")).click();
    }

    private WebElement priceelement;

    public void price() {
        String str1 = driver.findElement(By.xpath("//div[@id=\"products-list\"]/a[1]/div[@class=\"catalog__item-price\"]/div[@class=\"catalog__item-price-new\"]")).getText();
        str1 = str1.replaceAll(" ", "").replaceAll("₽", "");
        int str3 = Integer.parseInt(str1);
        kolichestvo = driver.findElements(By.xpath("//a[@class=\"catalog__item owox-catalog-list\"]")).size();
        String str2 = driver.findElement(By.xpath("//div[@id=\"products-list\"]/a[" + kolichestvo + "]/div[@class=\"catalog__item-price\"]/div[@class=\"catalog__item-price-new\"]")).getText();
        str2 = str2.replaceAll(" ", "").replaceAll("₽", "");

        System.out.println(str1 + " " + str2);
        if (str1.equals(str2)) {
            System.out.println("Все чики пуки!");
        } else {
            System.out.println("Не чики пуки!");
        }


    }

    public void minmax() {
        // List<WebElement> minmaxList = driver.findElements(By.xpath("//a[@class=\"catalog__item owox-catalog-list\"]"));


        ArrayList<Integer> rList = new ArrayList<Integer>();
        String attribute;
        kolichestvo = driver.findElements(By.xpath("//a[@class=\"catalog__item owox-catalog-list\"]")).size();

        for (int i = 1; i <= kolichestvo; i++) {
            attribute = driver.findElement(By.xpath("(//div[@class='catalog__item-price'])[" + i + "]")).getAttribute("itemprop");
            String str1;
            int str3;
            if (attribute.equals("offers")) {
                str1 = driver.findElement(By.xpath("(//div[@class='catalog__item-price'])[" + i + "]//div[@class=\"catalog__item-price-new\"]")).getText();
                str1 = str1.replaceAll(" ", "").replaceAll("₽", "");
                str3 = Integer.parseInt(str1);
                rList.add(str3);
            } else {
                str1 = driver.findElement(By.xpath("(//div[@class=\"catalog__item-price\"])[" + i + "]")).getText();
                str1 = str1.replaceAll(" ", "").replaceAll("₽", "");
                str3 = Integer.parseInt(str1);
                rList.add(str3);
            }
        }

        ArrayList<Integer> rlist1 = (ArrayList<Integer>)rList.clone();
        Collections.sort(rlist1);
        if (rList.equals(rlist1)){
            System.out.println("Все чики пуки!");
        }
        else {
            System.out.println("Везде беда!:)");
        }




        int min = Collections.min(rList);
        int max = Collections.max(rList);

        String attribute1 = driver.findElement(By.xpath("(//div[@class='catalog__item-price'])[1]")).getAttribute("itemprop");
        String attribute2 = driver.findElement(By.xpath("(//div[@class='catalog__item-price'])[" + kolichestvo + "]")).getAttribute("itemprop");

        int strMin;
        if (attribute1.equals("offers")) {
            String str4 = driver.findElement(By.xpath("(//div[@class='catalog__item-price'])[1]//div[@class=\"catalog__item-price-new\"]")).getText();
            str4 = str4.replaceAll(" ", "").replaceAll("₽", "");
            strMin = Integer.parseInt(str4);
        } else {
            String str4 = driver.findElement(By.xpath("(//div[@class=\"catalog__item-price\"])[1]")).getText();
            str4 = str4.replaceAll(" ", "").replaceAll("₽", "");
            strMin = Integer.parseInt(str4);
        }

        int strMax;
        if (attribute2.equals("offers")) {
            String str5 = driver.findElement(By.xpath("(//div[@class='catalog__item-price'])[" + kolichestvo + "]//div[@class=\"catalog__item-price-new\"]")).getText();
            str5 = str5.replaceAll(" ", "").replaceAll("₽", "");
            strMax = Integer.parseInt(str5);
        } else {
            String str5 = driver.findElement(By.xpath("(//div[@class=\"catalog__item-price\"])[" + kolichestvo + "]")).getText();
            str5 = str5.replaceAll(" ", "").replaceAll("₽", "");
            strMax = Integer.parseInt(str5);
        }

        if (strMin == min) {
            System.out.println("ok");
        } else {
            System.out.println("ne ok");
        }

        if (strMax == max) {
            System.out.println("ok");
        } else {
            System.out.println("ne ok");
        }


    }
    //тест 5, авторизация, проверка

    @FindBy(xpath = "//a[@class=\"header__login-link js-popup\"]")
    WebElement openauth; //открытие авторизации
    public void auth (){
        //   driver.get("https://new.web1.mylgc.ru/");
        openauth.click();

    }
    @FindBy(xpath = "//div[@class=\"links-bottom-center\"]")
    WebElement linkauth; //переход по ссылке "Войти с помощъю пароля"
    public void linkauth1(){
        linkauth.click();
    }
    // @FindBy(xpath = "//div[@class=\"input input--default login__input\"]/label[contains(text(), \"E-mail или номер телефона\")]")
    //  WebElement input; //ввод e-mail
    String email = "popok.f@qasquad.ru";
    public void inputmailpass(){ //ввод маил и пароль
        driver.findElement(By.xpath("//div[@class=\"auth-form-email-pass\"]//div[@class=\"input input--default login__input\"]/input")).sendKeys(email);
        driver.findElement(By.xpath("//div[@class=\"auth-form-email-pass\"]//div[@class=\"input input--default input--nomark login__input\"]/input")).sendKeys("qwerty123");
    }

    public void inakk() { //нажать на кнопку подтверждения
        driver.findElement(By.xpath("//button[@class=\"button button--fill login__button\"]")).click();
    }
    public void validakk(){
        //проверка аккаунта
        driver.findElement(By.xpath("//a[@class=\"header__login-link js-popup owox-logout\"]")).click();

        driver.findElement(By.xpath("//div[contains(text(),\"Мои данные\")]")).click();
        String name = driver.findElement(By.xpath("//label[contains(text(), \"E-mail\")]/following-sibling::input")).getAttribute("value");

        if (email.equals(name)){
            System.out.println("ОК - popok.f@qasquad.ru");
        }
        else {
            System.out.println("не ок");
        }

    }

    public void registration(){ // нажатие на кнопку авторизации при оформлении заказа
        driver.findElement(By.xpath("//a[@class=\"button button--yellow btn-full\"]")).click();
    }




}










