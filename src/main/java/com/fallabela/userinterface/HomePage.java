package com.fallabela.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target TITULO_MENU = Target.the("Titulo menú").locatedBy("//*[@class='MarketplaceHamburgerBtn-module_title__2KG47']");
    public static final Target TITULO_NO_GRACIAS = Target.the("Titulo no gracias").locatedBy("//*[contains(text(),'No, gracias')]");
    public static final Target CATEGORIA_CELULAR = Target.the("Categoria ceular").locatedBy("//div[contains(text(),'Celulares y accesorios')]");
    public static final Target CATEGORIA_INFINIX = Target.the("Categoria infinix").locatedBy("//a[contains(text(),'Infinix')]");

}
