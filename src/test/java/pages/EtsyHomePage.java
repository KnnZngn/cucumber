package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class EtsyHomePage {
    public EtsyHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = ".top-nav-item.wt-pb-xs-2.wt-mr-xs-2")
    public List<WebElement> allProductsHoverOver; //All products li

    @FindBy(css = "#catnav-primary-link-10923")
    public WebElement clothing_shoes;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[2]/div[2]/div/div/div[3]/a/div[2]/p")
    public WebElement kids_baby;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[2]/div[2]/div/div/div[7]/a/div[2]/p")
    public WebElement baby_shoes;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[2]/div[2]/div/div/div[3]/a/div[2]/p")
    public WebElement boots;

    @FindBy(xpath = "//h2[text()=\"There's so much more for you to discover\"]")
    public WebElement textForScrollDown;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/div[9]/div/div/div/ul/li[64]/div/div/a/div[1]/div/div/div/div/div/img")
    public WebElement lastProduct;

    @FindBy(xpath ="//*[@id=\"content\"]/div/div[1]/div/div[3]/div[2]/div[2]/div[9]/div/div/div/ul/li[60]/div/div/a/div[2]/div/div[2]/p/span[1]")
    public WebElement priceOfSelectedShoes;

    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchBox;
    /*
    Given user goes to "url"
    And user does hover over "clothing and shoes" section
    And user click on "clothing and shoes" section
    And user click on "kids_baby" section
    And user click on "baby_shoes" section
    And user click on "boots" section
    When user scroll-down buttom of page up to title"There's so much more for you to discover"
    Then user verify that display this text"There's so much more for you to discover"
    And user takes and print "price of last products" inside the page


     */



}
//    @FindBy(id = "global-enhancements-search-query")
//    public WebElement searchBox;
//
//    @FindBy(xpath = "//img[@class]")
//    public List<WebElement> allTshirtList;
//
//    //*[@id="content"]/div/div[1]/div/div[4]/div[5]/div[3]/div[10]/div[1]/div/div/ul/li[1]/div/div/a[1]/div[1]/div/div/div/div/div/img
//    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div[4]/div[5]/div[3]/div[10]/div[1]/div/div/ul/li[1]/div/div/a[1]/div[1]/div/div/div/div/div/img")
//    public WebElement firstTshirtImg;
//
//    @FindBy(xpath = "//*[@id=\"listing-page-cart\"]/div[3]/div[1]/div[1]/div[1]/div/div[1]/div[1]/p/span[2]")
//    public WebElement priceOfSelectedTshirt;
