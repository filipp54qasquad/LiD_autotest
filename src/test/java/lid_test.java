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

}
