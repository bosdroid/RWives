// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.borisruzanov.russianwives.mvp.ui.chatmessage;

import dagger.MembersInjector;
import javax.inject.Provider;

public final class ChatMessageActivity_MembersInjector
    implements MembersInjector<ChatMessageActivity> {
  private final Provider<ChatMessagePresenter> presenterProvider;

  public ChatMessageActivity_MembersInjector(Provider<ChatMessagePresenter> presenterProvider) {
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<ChatMessageActivity> create(
      Provider<ChatMessagePresenter> presenterProvider) {
    return new ChatMessageActivity_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(ChatMessageActivity instance) {
    injectPresenter(instance, presenterProvider.get());
  }

  public static void injectPresenter(ChatMessageActivity instance, ChatMessagePresenter presenter) {
    instance.presenter = presenter;
  }
}
