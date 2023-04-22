package ru.tinkoff.edu.java.scrapper.service.jooq;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import ru.tinkoff.edu.java.scrapper.persistence.repository.jooq.JooqChatRepository;
import ru.tinkoff.edu.java.scrapper.service.TgChatService;

@Service
@RequiredArgsConstructor
@Slf4j
public class JooqChatService implements TgChatService {
    private final JooqChatRepository chatRepository;

    @Override
    public boolean register(long chatId) {
        try {
            chatRepository.addChatById(chatId);
            return true;
        } catch (DuplicateKeyException exc) {
            return false;
        }
    }

    @Override
    public void unregister(long chatId) {

    }

    @Override
    public boolean isChatExist(long chatId) {
        return false;
    }
}
