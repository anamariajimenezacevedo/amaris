package com.fallabela.userinterface;
public enum Option {
    FALLABELA("https://www.falabella.com.co/falabella-co");
    private final String URL;
    Option(String url){
        this.URL = url;
    }
    public String url(){
        return URL;
    }
}