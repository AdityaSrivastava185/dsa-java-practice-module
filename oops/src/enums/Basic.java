package enums;

public class Basic {
    // these are enum constants
    // every single one is public, static and final
    // since it is final you can not create child enums
    // type is Week
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // this is not public or protected , only private or default and it is not public because we do not want to create
        // new objects
        Week(){
            System.out.println("Constructor called for" + this.toString());
        }
    }

}
