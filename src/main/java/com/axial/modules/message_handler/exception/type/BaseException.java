package com.axial.modules.message_handler.exception.type;

import com.axial.modules.message_handler.model.Message;
import lombok.Getter;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.List;


@Getter
public class BaseException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private final String code;

    private final List<Message> messages;


    protected BaseException(String code, String message, Message... messages) {

        super(message);
        this.code = code;
        this.messages = ArrayUtils.isNotEmpty(messages) ? Arrays.asList(messages) : null;
    }

}
