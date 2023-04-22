/*
 * This file is generated by jOOQ.
 */
package ru.tinkoff.edu.java.scrapper.domain.jooq;


import javax.annotation.processing.Generated;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;

import ru.tinkoff.edu.java.scrapper.domain.jooq.tables.Chat;
import ru.tinkoff.edu.java.scrapper.domain.jooq.tables.ChatLink;
import ru.tinkoff.edu.java.scrapper.domain.jooq.tables.Link;
import ru.tinkoff.edu.java.scrapper.domain.jooq.tables.records.ChatLinkRecord;
import ru.tinkoff.edu.java.scrapper.domain.jooq.tables.records.ChatRecord;
import ru.tinkoff.edu.java.scrapper.domain.jooq.tables.records.LinkRecord;


/**
 * A class modelling foreign key relationships and constraints of tables in the
 * default schema.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.17.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ChatRecord> CONSTRAINT_1 = Internal.createUniqueKey(Chat.CHAT, DSL.name("CONSTRAINT_1"), new TableField[] { Chat.CHAT.ID }, true);
    public static final UniqueKey<ChatLinkRecord> CONSTRAINT_868 = Internal.createUniqueKey(ChatLink.CHAT_LINK, DSL.name("CONSTRAINT_868"), new TableField[] { ChatLink.CHAT_LINK.CHAT_ID, ChatLink.CHAT_LINK.LINK_ID }, true);
    public static final UniqueKey<LinkRecord> CONSTRAINT_2 = Internal.createUniqueKey(Link.LINK, DSL.name("CONSTRAINT_2"), new TableField[] { Link.LINK.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<ChatLinkRecord, ChatRecord> CONSTRAINT_8 = Internal.createForeignKey(ChatLink.CHAT_LINK, DSL.name("CONSTRAINT_8"), new TableField[] { ChatLink.CHAT_LINK.CHAT_ID }, Keys.CONSTRAINT_1, new TableField[] { Chat.CHAT.ID }, true);
    public static final ForeignKey<ChatLinkRecord, LinkRecord> CONSTRAINT_86 = Internal.createForeignKey(ChatLink.CHAT_LINK, DSL.name("CONSTRAINT_86"), new TableField[] { ChatLink.CHAT_LINK.LINK_ID }, Keys.CONSTRAINT_2, new TableField[] { Link.LINK.ID }, true);
}
