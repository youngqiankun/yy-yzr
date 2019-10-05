package com.yytec.dogmell.models;

import com.google.gson.Gson;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

/**
 * @author yangyang
 * @date 10/5/19 10:04
 */
public class MessageEncoder implements Encoder.Text<Message> {
    private static Gson gson;

    @Override
    public String encode(Message message) throws EncodeException {
        return gson.toJson(message);
    }

    @Override
    public void init(EndpointConfig endpointConfig) {

    }

    @Override
    public void destroy() {

    }
}
