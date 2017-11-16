package fr.husta.test;

import fr.husta.test.api.ApiService;
import fr.husta.test.logging.SLF4JBridgeHandlerUtils;
import fr.husta.test.xml.BreakfastMenu;
import fr.husta.test.xml.Food;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class ApiServiceClientTest
{

    public static final String BASE_URL = "https://www.w3schools.com/";

    private ApiService apiService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @BeforeClass
    public static void setUpGlobal()
    {
        SLF4JBridgeHandlerUtils.initSLF4JBridgeHandler();
    }

    @Before
    public void setUp() throws Exception
    {
        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder()
                // Use Logging : JUL
                .addInterceptor(new HttpLoggingInterceptor()
                        .setLevel(HttpLoggingInterceptor.Level.HEADERS));

        OkHttpClient httpClient = httpClientBuilder.build();
        logger.info("OkHttpClient proxy config : {}", httpClient.proxy());
        logger.info("OkHttpClient proxySelector : {}", httpClient.proxySelector());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .client(httpClient)
                .build();

        apiService = retrofit.create(ApiService.class);
    }

    @Test
    public void testApiCall() throws Exception
    {
        Call<BreakfastMenu> call = apiService.getBreakfastMenu();
        Response<BreakfastMenu> response = call.execute();
        assertThat(response.code()).isEqualTo(200);

        BreakfastMenu breakfastMenu = response.body();
        assertThat(breakfastMenu).isNotNull();
        assertThat(breakfastMenu.getFoodList()).isNotEmpty();
        for (Food food : breakfastMenu.getFoodList())
        {
            logger.info("Food : {} - {} [{}]", food.getName(), food.getDescription(), food.getPrice());
        }
    }

}
