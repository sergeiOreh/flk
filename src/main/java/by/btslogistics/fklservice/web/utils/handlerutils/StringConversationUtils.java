package by.btslogistics.fklservice.web.utils.handlerutils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Утилиты для преобразования текста
 */
public class StringConversationUtils {


    public static List<String> getListErrMessage(String msg){

        Stream<String> stream = Arrays.stream(msg.split("\n"))
                .filter(s -> s.contains("\t"))
                .map(s -> s.replaceAll("^([^\\{]+)\\{", ""))
                .map(s -> s.replaceAll("[\"]", ""))
                .map(s -> s.replaceAll("=", ":"))
                .map(s -> s.replaceAll("interpolatedMessage", "message"))
                .map(s -> s.replaceAll("\\{|\\}(, *)?", ""));

        return stream.collect(Collectors.toList());
    }

}
