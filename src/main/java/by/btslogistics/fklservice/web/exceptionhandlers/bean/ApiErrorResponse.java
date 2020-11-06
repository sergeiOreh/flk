package by.btslogistics.fklservice.web.exceptionhandlers.bean;

import org.springframework.http.HttpStatus;


/**
 * модель объекта, который будет аккумулировать ошибку,
 * в случае отправки клиенту.
 */
public class ApiErrorResponse {

    /**
     *   name http status code (имя кода статуса обработки HTTP-запроса)
     */
    private HttpStatus status;

    /**
     *   код http status code (код статуса обработки HTTP-запроса)
     */
    private int statusCode;


    /**
     * Пользовательское сообщение об ошибке, который вы
     * отравляете клиенту вашего API*/
    private String message;

    public ApiErrorResponse() {
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private ApiErrorResponse(Builder builder) {
        status = builder.status;
        statusCode = builder.statusCode;
        message = builder.message;
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    public static final class Builder {
        private HttpStatus status;
        private int statusCode;
        private String message;

        private Builder() {
        }

        public Builder status(HttpStatus val) {
            status = val;
            return this;
        }

        public Builder statusCode(int val) {
            statusCode = val;
            return this;
        }

        public Builder message(String val) {
            message = val;
            return this;
        }

        public ApiErrorResponse build() {
            return new ApiErrorResponse(this);
        }
    }

    @Override
    public String toString() {
        return "ApiErrorResponse{" +
                "status=" + status +
                ", statusCode=" + statusCode +
                ", message='" + message + '\'' +
                '}';
    }
}
