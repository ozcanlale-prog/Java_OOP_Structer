

public class Stock_Test {
    public static void main(String[] args){
        
        Stock stc_deneme_1 = new Stock("ASL", "Astrosil"); //Deneme rakamlarım :)
        stc_deneme_1.previousClosingPrice = 12.3;
        stc_deneme_1.currentPrice = 10.15;
        
        Stock stc_deneme_2 = new Stock("ASL", "Astrosil");
        stc_deneme_2.previousClosingPrice = 42.3;
        stc_deneme_2.currentPrice = 150.15;
        
        
        Stock stc1 = new Stock("ASL", "Astrosil"); // Son rakamlarım :):):):)   
        stc1.previousClosingPrice = 142.3;
        stc1.currentPrice = 120.15;        
                
        Stock stc2 = new Stock("ASL", "Astrosil");        
        stc2.previousClosingPrice = 423.3;
        stc2.currentPrice = 101.15;        
            
                
        System.out.println("Denemeler -1: ");
        System.out.println("Hissemiz: "+ stc_deneme_1.symbol + " " + stc_deneme_1.name);
        System.out.println("Kapanis: " + stc_deneme_1.previousClosingPrice + "Guncellenmis hali: " + stc_deneme_1.currentPrice);
        System.out.println("Degisim yuzdesi : " + stc_deneme_1.getChangePercent() );

        System.out.println("Denemeler -2: ");
        System.out.println("Hissemiz: "+ stc_deneme_2.symbol + " " + stc_deneme_2.name);
        System.out.println("Kapanis: " + stc_deneme_2.previousClosingPrice + "Guncellenmis hali: " + stc_deneme_2.currentPrice);
        System.out.println("Degisim yuzdesi : " + stc_deneme_2.getChangePercent() );

        System.out.println("Asil sayilar -1: ");
        System.out.println("Hissemiz: "+ stc1.symbol + " " + stc1.name);
        System.out.println("Kapanis: " + stc1.previousClosingPrice + "Guncellenmis hali: " + stc1.currentPrice);
        System.out.println("Degisim yuzdesi : " + stc1.getChangePercent() );

        System.out.println("Asil sayilat -1: ");
        System.out.println("Hissemiz: "+ stc2.symbol + " " + stc2.name);
        System.out.println("Kapanis: " + stc2.previousClosingPrice + "Guncellenmis hali: " + stc2.currentPrice);
        System.out.println("Degisim yuzdesi : " + stc2.getChangePercent() );
        
    }
}