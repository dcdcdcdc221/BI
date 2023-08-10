package com.yupi.springbootinit.bizmq;

import lombok.SneakyThrows;
import org.springframework.transaction.TransactionManager;

import javax.naming.InitialContext;

public interface BiMqConstant {

    String BI_QUEUE_NAME = "bi_queue";

    String BI_EXCHANGE = "bi_exchange";

    String BI_ROUTING_KEY = "bi_routing_key";
}
class a{
    @SneakyThrows
    void c(){
        // 获取InitialContext对象
        InitialContext initialContext = new InitialContext();
        // 通过JNDI名称获取TransactionManager对象，这里的名字是示例名字
        TransactionManager transactionManager = (TransactionManager) initialContext.lookup("java:/TransactionManager");
    }

}
