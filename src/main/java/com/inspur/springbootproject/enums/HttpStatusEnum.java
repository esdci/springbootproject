package com.inspur.springbootproject.enums;

/**
 * @author Inspur
 * @version 1.0 15:18 2019/5/16
 * @description Http状态枚举类
 */
public enum HttpStatusEnum {
    OK("20000", "OK", "请求已经成功处理"),
    NO_CONTENT("204", "No Content", "请求已经成功处理，没有内容需要返回"),
    //BAD_REQUEST("400", "Bad Request", "请求错误，请修正请求"),
    //NOT_FOUND("404", "Not Found", "资源未找到"),

    /* 未知异常 */
    UNKNOWN_ERROR("00000", "unknown-error",""),
    /* 成功状态码 */
    SUCCESS("20000", "successful",""),

    /* 权限异常*/
    VALIDATE_FAILED("30001", "validate-failed",""),
    AUTH_FAILED("30002", "auth-failed",""),
    ACCESS_DENIED("30003", "access-denied",""),

    /* 请求异常 */
    BAD_REQUEST("40001", "bad-request",""),
    FORBIDDEN("40002", "forbidden",""),
    NOT_FOUND("40003", "not-found",""),
    ALREADY_EXIST("40004", "already-exist",""),
    FS_OPERATION_ERROR("41001", "fs-operation-error",""),
    FILE_NOT_EXIST("41002", "file-not-exist",""),
    FILE_UPLOAD_ERROR("41003", "file-upload-error",""),
    FILE_DOWNLOAD_ERROR("41004", "file-download-error",""),
    FILE_IN_RESERVED_PATH("41005", "file-in-reserved-path",""),

    /* 系统异常 */
    SERVER_ERROR("50001", "server-error",""),
    NOT_IMPLEMENTED("50002", "not-implemented",""),
    NOT_SUPPORTED("50003", "not-supported",""),
    STORAGE_ERROR("50004", "storage-error",""),
    SERVICE_UNAVAILABLE("50005", "service-unavailable",""),
    FS_SERVICE_ERROR("51001", "fs-service-error",""),

    /* 连接异常 */
    SOCKET_CLOSED("60001", "socket-closed",""),
    SOCKET_EXPIRED("60002", "socket-expired",""),
    FS_CONNECTION_ERROR("61001", "fs-connection-error","");


    /**
     * 状态码code
     */
    private final String code;
    /**
     * 状态英文描述
     */
    private final String reasonPhraseUS;
    /**
     * 状态中文描述
     */
    private final String reasonPhraseCN;

    HttpStatusEnum(String code, String reasonPhraseUS, String reasonPhraseCN) {
        this.code = code;
        this.reasonPhraseUS = reasonPhraseUS;
        this.reasonPhraseCN = reasonPhraseCN;
    }

    public String code() {
        return code;
    }

    public String reasonPhraseUS() {
        return reasonPhraseUS;
    }

    public String reasonPhraseCN() {
        return reasonPhraseCN;
    }
}
