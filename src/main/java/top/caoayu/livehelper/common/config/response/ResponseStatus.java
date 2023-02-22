package top.caoayu.livehelper.common.config.response;/*
 *
 * @version 2023/2/21 16:12
 * @author 14012
 */

import java.util.List;
public enum ResponseStatus {

    SUCCESS("200", "success"),
    FAIL("500", "failed"),

    HTTP_STATUS_200("200","OK"),
    HTTP_STATUS_400("400", "request error"),
    HTTP_STATUS_401("401", "no authentication"),
    HTTP_STATUS_403("403", "no authorities"),
    HTTP_STATUS_500("500", "server error");



    public static final List<ResponseStatus> HTTP_STATUS_ALL = List.of(HTTP_STATUS_200, HTTP_STATUS_403, HTTP_STATUS_400, HTTP_STATUS_401, HTTP_STATUS_500);
    private final String responseCode;
    private final String description;
    private ResponseStatus(String responseCode, String description) {
        this.responseCode = responseCode;
        this.description = description;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public String getDescription() {
        return description;
    }
}
