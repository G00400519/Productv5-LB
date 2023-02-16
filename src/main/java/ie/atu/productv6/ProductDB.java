package ie.atu.productv6;

public class ProductDB {

    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Product p = null;

        if (productCode.equalsIgnoreCase("java"))
        {
           Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            p = myBook;
        }


        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            p = mySoftware;
        }

        if (productCode.equalsIgnoreCase("pink")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Wish you were here");
            myMusic.setPrice(8.50);
            myMusic.setLabel("Columbia Group");
            myMusic.setArtist("Pink Floyd");
            p = myMusic;
        }   else if(productCode.equalsIgnoreCase("metal")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Master of Puppets");
            myMusic.setPrice(8.50);
            myMusic.setLabel("Elektra");
            myMusic.setArtist("Metallic");
            p = myMusic;
        }   else if(productCode.equalsIgnoreCase("pop")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Bones");
            myMusic.setPrice(8.50);
            myMusic.setLabel("Interscope; Kidinakorner");
            myMusic.setArtist("Imagine Dragons");
            p = myMusic;
        }

        if (productCode.equalsIgnoreCase("samsung")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("SAMSUNG UE43BU8000KXXU 43\" Smart 4K Ultra HD HDR LED TV with Bixby, Alexa & Google Assistant");
            myTV.setPrice(480);
            myTV.setManufacturer("Samsung");
            myTV.setScreen_size("43");
            p = myTV;
        }   else if(productCode.equalsIgnoreCase("sony")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("SONY BRAVIA KD32W800PU 32\" Smart HD Ready HDR LED TV with Google Assistant");
            myTV.setPrice(370);
            myTV.setManufacturer("Sony");
            myTV.setScreen_size("32");
            p = myTV;
        }   else if (productCode.equalsIgnoreCase("toshiba")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("TOSHIBA 32WK3C63DB 32\" Smart HD Ready HDR LED TV with Amazon Alexa");
            myTV.setPrice(200);
            myTV.setManufacturer("Toshiba");
            myTV.setScreen_size("32");
            p = myTV;
        }
        return p;
    }
}

