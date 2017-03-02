package eu.corstjens.example.spring.boot.cxf.webservice.endpoint.impl;


import eu.corstjens.example.spring.boot.cxf.webservice.endpoint.ExempleEndpoint;
import eu.corstjens.example.spring.boot.cxf.webservice.endpoint.Request;
import eu.corstjens.example.spring.boot.cxf.webservice.endpoint.RequestGetCodeForFirstNameLastName;
import eu.corstjens.example.spring.boot.cxf.webservice.endpoint.BasicResponse;
import eu.corstjens.example.spring.boot.cxf.webservice.service.MessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by koencorstjens on 22/02/17.
 */

@Service
public class ExempleEndpointImpl implements ExempleEndpoint {

    private final MessagesService messagesService;

    @Autowired
    public ExempleEndpointImpl(MessagesService messagesService) {
        this.messagesService = messagesService;
    }

    @Override
    public BasicResponse sendMessages(Request request) {
        BasicResponse basicResponse = new BasicResponse();
        basicResponse.setMessages(messagesService.getHallo());
        return basicResponse;
    }

    @Override
    public BasicResponse getCodeForFirstNameLastName(RequestGetCodeForFirstNameLastName requestGetCodeForFirstNameLastName) {
        BasicResponse basicResponse = new BasicResponse();
        basicResponse.setMessages(messagesService.getHallo());
        return basicResponse;
    }

    @Override
    public String test() {
        return "test Ok";
    }
}
