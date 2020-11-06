package by.btslogistics.fklservice;

import by.btslogistics.fklservice.dao.model.flk.model.jsonmodel.Rule;
import by.btslogistics.fklservice.web.rest.flk.read.flktypecontrol.FlkTypeControlReadRest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.SpelParserConfiguration;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.test.web.servlet.MockMvc;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//@SpringBootTest
//@AutoConfigureMockMvc
class FklServiceApplicationTests {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private FlkTypeControlReadRest flkTypeControlReadRestController;

    @Test
    public void test() throws Exception {
     /*   this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello, World")));*/
    }

    @Test
    public void testSerializingWithJsonProperty()
            throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
//          String jsonString = mapper.writeValueAsString(new PropertyDemoBean());
//          System.out.println(jsonString);
//          assertThat(jsonString, containsString("James Clark"));
//          assertThat(jsonString, containsString("123"));
    }

    @Test
    public void testDeSerializingWithJsonProperty() throws IOException {
        String jsonString = "{\"person-id\": 231, \"name\": \"Maryg Parker\"}";
        ObjectMapper mapper = new ObjectMapper();
        //   PropertyDemoBean bean = mapper.readValue(jsonString, PropertyDemoBean.class);
        //   System.out.println(bean);
        //assertThat(bean.name, is(equalTo("Mary Parker")));
        //assertThat(bean.personId, is(equalTo(231L)));
    }

    @Test
    public void testDeSerializingArrayWithJsonProperty() throws IOException {
        String jsonString =
                "[{\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\"element\": \"stat:Stat_CU/stat:CustomsProcedure\",\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\"sourceOperator\":\"fromXml\",\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\"level\" : \"simple\",\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t \t\"logicalOperator\": \"equal\",\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t \t\"values\": [\"ИМ\"]\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t},\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t{\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\"element\": \"stat:Stat_CU/stat:Stat_CUGoods/stat:DestinationCountry/stat:DestinationCountryCode\",\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\"sourceOperator\":\"fromXml\",\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\"level\" : \"composite\",\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t \t\"logicalOperator\": \"notequal\",\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t \t\"values\": [\"RU\",\"KZ\",\"BY\",\"AM\",\"KG\"]\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t}" + "]";
        ObjectMapper mapper = new ObjectMapper();

        List<Rule> bean = Arrays.asList(mapper.readValue(jsonString, Rule[].class));

        //List<PropertyDemoBean> bean = Arrays.asList(mapper.readValue(jsonString, PropertyDemoBean[].class));

        System.out.println(bean);

    }

    @Test
    public void parseCheckExpression() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        HashMap bean = mapper.readValue(getClass().getClassLoader().getResource("checkExpression.json"), HashMap.class);

        //List<PropertyDemoBean> bean = Arrays.asList(mapper.readValue(jsonString, PropertyDemoBean[].class));
        List blockRules = (List) bean.get("blockRules");

        System.out.println(blockRules.get(0));

    }

    @Test
    public void testD() throws IOException {
        class Demo {
            public List<String> list;
        }
        SpelParserConfiguration config = new SpelParserConfiguration(true, true);

        ExpressionParser parser = new SpelExpressionParser(config);

        Expression expression = parser.parseExpression("list[3]");

        Demo demo = new Demo();

        Object o = expression.getValue(demo);
    }




}
