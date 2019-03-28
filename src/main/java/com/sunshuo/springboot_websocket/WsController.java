/**
 * 
 */
package com.sunshuo.springboot_websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.sunshuo.springboot_websocket.domain.WiselyMessage;
import com.sunshuo.springboot_websocket.domain.WiselyResponse;

/**
 * @ClassName: WsController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author SunShuo
 * @date 2019年3月28日
 */
@Controller
public class WsController {
    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WiselyResponse say(WiselyMessage wiselyMessage) throws Exception {
        Thread.sleep(3000);
        return new WiselyResponse("Welcome " + wiselyMessage.getName() + "!");
    }
}
