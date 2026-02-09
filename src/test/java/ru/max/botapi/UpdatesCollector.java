package ru.max.botapi;

import java.util.ArrayList;
import java.util.List;

import ru.max.botapi.model.*;


public class UpdatesCollector extends DelegatingUpdateVisitor {
    private final List<Update> updates = new ArrayList<>();

    public UpdatesCollector(Update.Visitor delegate) {
        super(delegate);
    }

    @Override
    public void visit(MessageCreatedUpdate model) {
        super.visit(model);
        updates.add(model);
    }

    @Override
    public void visit(MessageCallbackUpdate model) {
        super.visit(model);
        updates.add(model);
    }

    @Override
    public void visit(MessageEditedUpdate model) {
        super.visit(model);
        updates.add(model);
    }

    @Override
    public void visit(MessageRemovedUpdate model) {
        super.visit(model);
        updates.add(model);
    }

    @Override
    public void visit(BotAddedToChatUpdate model) {
        super.visit(model);
        updates.add(model);
    }

    @Override
    public void visit(BotRemovedFromChatUpdate model) {
        super.visit(model);
        updates.add(model);
    }

    @Override
    public void visit(UserAddedToChatUpdate model) {
        super.visit(model);
        updates.add(model);
    }

    @Override
    public void visit(UserRemovedFromChatUpdate model) {
        super.visit(model);
        updates.add(model);
    }

    @Override
    public void visit(BotStartedUpdate model) {
        super.visit(model);
        updates.add(model);
    }

    @Override
    public void visit(BotStoppedUpdate model) {
        super.visit(model);
        updates.add(model);
    }

    @Override
    public void visit(ChatTitleChangedUpdate model) {
        super.visit(model);
        updates.add(model);
    }

    @Override
    public void visitDefault(Update model) {
        super.visitDefault(model);
        updates.add(model);
    }

    public List<Update> getUpdates() {
        return updates;
    }
}
