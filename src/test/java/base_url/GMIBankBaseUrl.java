package base_url;

import Utilities.Authentication;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class GMIBankBaseUrl extends Authentication {

    protected RequestSpecification spec03;

    @Before
    public void setUp(){
        spec03=new RequestSpecBuilder().setBaseUri("http://www.gmibank.com/api").build();
    }
}
