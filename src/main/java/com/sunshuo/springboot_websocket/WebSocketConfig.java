/**
 * 
 */
package com.sunshuo.springboot_websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * @ClassName: WebSocketConfig
 * @Description: https://github.com/SunShuo1234/spring-boot-starter-websocket.git
 * @author SunShuo
 * @date 2019年3月28日
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.web.socket.config.annotation.
     * WebSocketMessageBrokerConfigurer#registerStompEndpoints(org.
     * springframework.web.socket.config.annotation.StompEndpointRegistry)
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        /*
         * 注册STOPM协议的节点（endpoint），并映射的指定的URL
         */
        /*
         * 注册一个STOPM节点（endpoint），并指定使用SockJS协议
         */
        registry.addEndpoint("/endpointWisely").withSockJS();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.springframework.web.socket.config.annotation.
     * AbstractWebSocketMessageBrokerConfigurer#configureMessageBroker(org.
     * springframework.messaging.simp.config.MessageBrokerRegistry)
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        /*
         * 配置消息代理
         */
        /*
         * 广播式应配置一个/topic消息代理
         */
        registry.enableSimpleBroker("/topic");
    }

}
