// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.borisruzanov.russianwives.mvp.model.interactor;

import com.borisruzanov.russianwives.mvp.model.repository.user.UserRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class OnlineUsersInteractor_Factory implements Factory<OnlineUsersInteractor> {
  private final Provider<UserRepository> mRepositoryProvider;

  public OnlineUsersInteractor_Factory(Provider<UserRepository> mRepositoryProvider) {
    this.mRepositoryProvider = mRepositoryProvider;
  }

  @Override
  public OnlineUsersInteractor get() {
    return new OnlineUsersInteractor(mRepositoryProvider.get());
  }

  public static Factory<OnlineUsersInteractor> create(
      Provider<UserRepository> mRepositoryProvider) {
    return new OnlineUsersInteractor_Factory(mRepositoryProvider);
  }
}
