package com.nishant.service;

import com.nishant.Domain.EmailData;
import com.nishant.Domain.InvoiceStatus;
import com.nishant.Domain.OrderInfo;
import com.nishant.KafkaProducer.EmailProducer;
import com.nishant.constants.OrderStatus;
import org.springframework.stereotype.Service;

/**
 * Created by z001ld8 on 7/30/18.
 */
@Service
public class EmailSenderServiceImpl implements InfoSenderService {


    public EmailSenderServiceImpl(InvoiceServiceImpl invoiceServiceImpl) {
        this.invoiceService = invoiceServiceImpl;
    }

    @Override
    public void Send(OrderInfo orderInfo) {
        /*
        1. this method will send the email
        2. in case of failure the orderid will be added to a failure repo and will be retried by scheduler
         */
    }


}
