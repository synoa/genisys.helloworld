package de.synoa.configurations;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.camel.component.ActiveMQComponent;
import org.apache.activemq.pool.PooledConnectionFactory;
import org.apache.camel.component.jms.JmsConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.synoa.App;

//@Configuration
public class ActiveMQ {

//    private static final String QUEUE_BASE = "activemq:{{activemq.queue.prefix}}.";
//
//    private static final String TOPIC_BASE = "activemq:topic:{{activemq.queue.prefix}}.";
//
//    // TODO CHANGE ME!!
//    public static final String NICE_QUEUE = QUEUE_BASE + "nice.queue";
//
//    // TODO CHANGE ME!!
//    public static final String SUPER_TOPIC = TOPIC_BASE + "super.topic";
//
//    @Bean(name = "pooledConnectionFactory", initMethod = "start", destroyMethod = "stop")
//    public PooledConnectionFactory createActiveMQConnectionPool(@Value("${activemq.url}") String brokerURL) {
//
//        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(brokerURL);
//        connectionFactory.setClientID(App.class.getPackage().getName());
//
//        PooledConnectionFactory connectionPool = new PooledConnectionFactory(connectionFactory);
//        connectionPool.setMaxConnections(1);
//        connectionPool.setReconnectOnException(true);
//
//        return connectionPool;
//    }
//
//    @Bean(name = "activemq")
//    public ActiveMQComponent createActiveMQComponent(@Value("${activemq.url}") String brokerURL) {
//
//        JmsConfiguration jmsConfiguration = new JmsConfiguration(createActiveMQConnectionPool(brokerURL));
//        jmsConfiguration.setConcurrentConsumers(1);
//
//        ActiveMQComponent activeMQComponent = new ActiveMQComponent();
//        activeMQComponent.setConfiguration(jmsConfiguration);
//        activeMQComponent.setTransacted(true);
//
//        return activeMQComponent;
//    }

}
