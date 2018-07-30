package com.nishant.consumer;

import com.nishant.Domain.OrderInfo;
import com.nishant.service.InfoSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * Created by z001ld8 on 7/30/18.
 */
@Service
@Slf4j
@PropertySource("classpath:bootstrap.properties")
public class SMSInfoConsumer implements AcknowledgingMessageListener<ConsumerRecord, Acknowledgment>  {

    @Value("${EmailInfoTopic}")
    private String orderInfoTopic;
    private final String OP_CONSUMING_ORDERINFO = "consume_email_info";
    private InfoSenderService infoSenderService;

    @Autowired
    public OrderInfoConsumer(@Qualifier("EmailSenderServiceImpl") InfoSenderService infoSenderService)
    {
        this.infoSenderService = infoSenderService;
    }

    @Override
    @KafkaListener(topics = "${EmailInfoTopic}")
    public void onMessage(ConsumerRecord record, Acknowledgment acknowledgment) {




        infoSenderService.send(emailData)


    }

}
