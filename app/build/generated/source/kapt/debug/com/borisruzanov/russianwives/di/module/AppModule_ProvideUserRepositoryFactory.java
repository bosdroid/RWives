// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.borisruzanov.russianwives.di.module;

import com.borisruzanov.russianwives.mvp.model.data.prefs.Prefs;
import com.borisruzanov.russianwives.mvp.model.repository.user.UserRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AppModule_ProvideUserRepositoryFactory implements Factory<UserRepository> {
  private final AppModule module;

  private final Provider<Prefs> prefsProvider;

  public AppModule_ProvideUserRepositoryFactory(AppModule module, Provider<Prefs> prefsProvider) {
    this.module = module;
    this.prefsProvider = prefsProvider;
  }

  @Override
  public UserRepository get() {
    return Preconditions.checkNotNull(
        module.provideUserRepository(prefsProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UserRepository> create(AppModule module, Provider<Prefs> prefsProvider) {
    return new AppModule_ProvideUserRepositoryFactory(module, prefsProvider);
  }
}
