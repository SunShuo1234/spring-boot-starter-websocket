/**
 * 
 */
package com.sunshuo.springboot_websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @ClassName: WebMvcConfig
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author SunShuo
 * @date 2019年3月28日
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    /*
     * (non-Javadoc)
     * 
     * @see
     * org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
     * #addViewControllers(org.springframework.web.servlet.config.annotation.
     * ViewControllerRegistry)
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/ws").setViewName("/ws");
    }
}
