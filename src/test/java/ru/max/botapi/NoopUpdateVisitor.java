package ru.max.botapi;

import ru.max.botapi.model.*;


public class NoopUpdateVisitor implements Update.Visitor {
    @Override
    public void visit(MessageCreatedUpdate model) {

    }

    @Override
    public void visit(MessageCallbackUpdate model) {

    }

    @Override
    public void visit(MessageEditedUpdate model) {

    }

    @Override
    public void visit(MessageRemovedUpdate model) {

    }

    @Override
    public void visit(BotAddedToChatUpdate model) {

    }

    @Override
    public void visit(BotRemovedFromChatUpdate model) {

    }

    @Override
    public void visit(UserAddedToChatUpdate model) {

    }

    @Override
    public void visit(UserRemovedFromChatUpdate model) {

    }

    @Override
    public void visit(BotStartedUpdate model) {

    }

    @Override
    public void visit(BotStoppedUpdate model) {

    }


    @Override
    public void visit(ChatTitleChangedUpdate model) {

    }

    @Override
    public void visit(MessageChatCreatedUpdate model) {

    }

    @Override
    public void visitDefault(Update model) {

    }
}
