package com.ms.email.consumers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ms.email.dtos.EmailDto;
import com.ms.email.models.EmailModel;
import com.ms.email.services.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    final EmailService service;

    public EmailConsumer(EmailService service){
        this.service = service;
    }

    @RabbitListener(queues = "${broker.queue.email.name}")
    public void listenEmailQueue(@Payload EmailDto dto){
        var emailModel = new EmailModel();
        BeanUtils.copyProperties(dto, emailModel);
        service.sendEmail(emailModel);
    }

}
