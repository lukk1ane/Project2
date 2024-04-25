package ge.tbc.itacademy.data;

import org.testng.annotations.DataProvider;

public class SwoopDataProvider {
    @DataProvider
    public static Object[][] minAndMaxPrice() {
        return new Object[][]{{200,250}, {150,200}, {250,300},{220,250}, {210,220}};
    }
}

