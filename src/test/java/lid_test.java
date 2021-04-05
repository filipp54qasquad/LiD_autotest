import org.junit.Test;

public class lid_test extends WebDriver_Settings {
    @Test
    public void first_Test() throws InterruptedException {
        lid_test_page lid_test1 = new lid_test_page(driver, wait);
        lid_test1.open();
        lid_test1.mensClick();
        lid_test1.shoesClick();
        lid_test1.favoriteClick();
        lid_test1.product_cardClick();
        lid_test1.add_cartClick();
        lid_test1.back_shoesClick();
        lid_test1.searchOpen();
        lid_test1.inputtext();
        //lid_test1.inputtextDich();
        lid_test1.pushsearch();
        lid_test1.cardsInPage();
        //lid_test1.cardsInPagezero();
        lid_test1.openCity();
        lid_test1.changeCity();
        lid_test1.saveCity();
        lid_test1.cityInPage();
        lid_test1.emailSubscribe();
        lid_test1.emailValidation();




    }
    @Test
    public void two_test() throws InterruptedException {
        lid_test_page lid_test2 = new lid_test_page(driver, wait);
        lid_test2.open();
        lid_test2.allClothes();
        lid_test2.openCard();
        lid_test2.addBasket();
        lid_test2.openBasket();
        lid_test2.orderPage();
        lid_test2.registration();
        //  lid_test2.nextAuth();
        lid_test2.linkauth1();
        lid_test2.inputmailpass();
        lid_test2.inakk();
        lid_test2.button();
        // lid_test2.textName();
        // lid_test2.lastName();
        // lid_test2.emailInput();
        // lid_test2.phoneNumber();
        lid_test2.addressInput();
        lid_test2.selectCity();
        lid_test2.deliveryMethod();
        lid_test2.selectChange();
        lid_test2.selectpvz();
        lid_test2.confirmationSelect();
        lid_test2.commentText();
        lid_test2.paymentmethod();
        lid_test2.confirmationorder();
        lid_test2.buttonordermake();

    }

    @Test
    public void three_test() throws InterruptedException {
        lid_test_page lid_test3 = new lid_test_page(driver, wait);
        lid_test3.open();
        lid_test3.closecookie();
        lid_test3.allClothes();
        lid_test3.randomClothes();


    }

    @Test
    public void four_test() throws InterruptedException {
        lid_test_page lid_test4 = new lid_test_page(driver, wait);
        lid_test4.open();
        lid_test4.closecookie();
        lid_test4.allClothes();
        lid_test4.sortingprice();
        lid_test4.selectprice();
        lid_test4.minmax();
    }

    //    @Test
//    public void five_test(){
//        lid_test_page lid_test5 = new lid_test_page(driver,wait);
//        driver.get("https://lgcity.ru/underwear/women/");
//        lid_test5.minmax();
    //  }
    @Test //авторизация
    public void five_test() throws InterruptedException {
        lid_test_page lid_test5 = new lid_test_page(driver, wait);
        lid_test5.open();
        lid_test5.auth();
        lid_test5.linkauth1();
        lid_test5.inputmailpass();
        lid_test5.inakk();
    }


}
