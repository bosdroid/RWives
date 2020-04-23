// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.borisruzanov.russianwives.di.module;

import com.borisruzanov.russianwives.mvp.model.repository.chats.ChatsRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class AppModule_ProvideChatsRepositoryFactory implements Factory<ChatsRepository> {
  private final AppModule module;

  public AppModule_ProvideChatsRepositoryFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public ChatsRepository get() {
    return Preconditions.checkNotNull(
        module.provideChatsRepository(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ChatsRepository> create(AppModule module) {
    return new AppModule_ProvideChatsRepositoryFactory(module);
  }
}
