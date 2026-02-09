package ru.max.botapi;

import ru.max.botapi.model.*;


public class DelegatingUpdateVisitor implements Update.Visitor {
    private final Update.Visitor delegate;

    public DelegatingUpdateVisitor(Update.Visitor delegate) {
        this.delegate = delegate;
    }

    @Override
    public void visit(MessageChatCreatedUpdate model) {
        delegate.visit(model);
    }

    @Override
    public void visit(MessageCreatedUpdate model) {
        delegate.visit(model);
    }

    @Override
    public void visit(MessageCallbackUpdate model) {
        delegate.visit(model);
    }

    @Override
    public void visit(MessageEditedUpdate model) {
        delegate.visit(model);
    }

    @Override
    public void visit(MessageRemovedUpdate model) {
        delegate.visit(model);
    }

    @Override
    public void visit(BotAddedToChatUpdate model) {
        delegate.visit(model);
    }

    @Override
    public void visit(BotRemovedFromChatUpdate model) {
        delegate.visit(model);
    }

    @Override
    public void visit(UserAddedToChatUpdate model) {
        delegate.visit(model);
    }

    @Override
    public void visit(UserRemovedFromChatUpdate model) {
        delegate.visit(model);
    }

    @Override
    public void visit(BotStartedUpdate model) {
        delegate.visit(model);
    }

    @Override
    public void visit(BotStoppedUpdate model) {
        delegate.visit(model);
    }

    @Override
    public void visit(ChatTitleChangedUpdate model) {
        delegate.visit(model);
    }

    @Override
    public void visitDefault(Update model) {
        delegate.visitDefault(model);
    }
}
