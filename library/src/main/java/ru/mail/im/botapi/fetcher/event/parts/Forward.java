package ru.mail.im.botapi.fetcher.event.parts;

import ru.mail.im.botapi.fetcher.Message;

public class Forward implements Part {
    private Message message;

    public Message getMessage() {
        return message;
    }
}
