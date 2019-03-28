/**
 * 
 */
package com.sunshuo.springboot_websocket.domain;

/**
 * @ClassName: WiselyResponse
 * @Description: 服务端向浏览器发送消息
 * @author SunShuo
 * @date 2019年3月28日
 */
public class WiselyResponse {
    private String responseMessage;

    public WiselyResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

}
