package ink.gatsby.giweyd.common;

import lombok.Getter;

@Getter
public class CommonResponse<T> {

    private CommonResponse(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private CommonResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private final Integer code;

    private final String message;

    private T data;

    public static <T> CommonResponse<T> success(T data) {
        return new CommonResponse<>(CommonResponseEnum.SUCCESS.getCode(),
                CommonResponseEnum.SUCCESS.getMessage(), data);
    }

    public static <T> CommonResponse<T> fail() {
        return new CommonResponse<>(CommonResponseEnum.FAIL.getCode(),
                CommonResponseEnum.FAIL.getMessage());
    }
}
