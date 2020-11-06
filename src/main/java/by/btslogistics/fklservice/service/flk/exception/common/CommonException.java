package by.btslogistics.fklservice.service.flk.exception.common;

/**
 * пользовательский объект RuntimeException, для выделение из
 * общего потока типов exceptions
 * Указывает на общие ошибки
 */
public class CommonException extends RuntimeException {

    public CommonException(String message) {
        super(message);
    }
}
