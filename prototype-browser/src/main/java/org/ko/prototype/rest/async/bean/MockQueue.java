package org.ko.prototype.rest.async.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class MockQueue {

    private static final Logger LOGGER = LoggerFactory.getLogger(MockQueue.class);

    /**
     * 下单消息, 当有值接到下单消息
     */
    private String placeOrder;

    /**
     * 订单完成消息, 当有值接到下单完成知识
     */
    private String completeOrder;

    public String getPlaceOrder() {
        return placeOrder;
    }

    public void setPlaceOrder(String placeOrder) {
        LOGGER.info("接到下单请求: {}", placeOrder);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            LOGGER.info("MockQueue#setPlaceOrder exception: {}", e);
        }
        this.completeOrder = placeOrder;
        LOGGER.info("下单请求处理完毕: {}", placeOrder);
    }

    public String getCompleteOrder() {
        return completeOrder;
    }

    public void setCompleteOrder(String completeOrder) {
        this.completeOrder = completeOrder;
    }
}
