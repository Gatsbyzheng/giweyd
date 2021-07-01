package ink.gatsby.giweyd.common;

import lombok.Getter;

@Getter
public enum CommonResponseEnum {

    SUCCESS(200, "成功"),
    FAIL(500, "服务器错误");

    CommonResponseEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private final Integer code;

    private final String message;
}
