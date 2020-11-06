package by.btslogistics.fklservice.constructor.visitor;

import by.btslogistics.fklservice.constructor.flkcheckoperators.RootFlkCheckOperator;
import by.btslogistics.fklservice.constructor.flkcheckoperators.hashmapoperator.HMRootOperator;
import by.btslogistics.fklservice.constructor.flkcheckoperators.operatorfactory.HMOperatorFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class FlkCheckExpressionVisitorImplTest {

    @Mock
    private SdXml xml;
    private HMOperatorFactory<Boolean> factory = new HMOperatorFactory<>();

    @Test
    void shouldVisitRootAndIfThenOperator() throws IOException {
        Mockito.when(xml.getValue(ArgumentMatchers.any())).thenReturn("ЭК");
        List<Object> blockRules = loadBlockRules();
        RootFlkCheckOperator<Boolean> root = new HMRootOperator<>(factory, blockRules);

        FlkCheckExpressionVisitorImpl visitor = new FlkCheckExpressionVisitorImpl(xml);
        Boolean isValid = visitor.visitRoot(root);
        Assertions.assertThat(isValid).isTrue();
    }

    private List<Object> loadBlockRules() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        HashMap bean = mapper.readValue(getClass().getClassLoader().getResource("checkExpression.json"), HashMap.class);
        return (List<Object>) bean.get("blockRules");
    }
}