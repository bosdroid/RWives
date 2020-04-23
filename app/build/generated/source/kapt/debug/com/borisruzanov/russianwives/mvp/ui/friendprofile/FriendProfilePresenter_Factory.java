// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.borisruzanov.russianwives.mvp.ui.friendprofile;

import com.borisruzanov.russianwives.mvp.model.interactor.friendprofile.FriendProfileInteractor;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class FriendProfilePresenter_Factory implements Factory<FriendProfilePresenter> {
  private final Provider<FriendProfileInteractor> interactorProvider;

  public FriendProfilePresenter_Factory(Provider<FriendProfileInteractor> interactorProvider) {
    this.interactorProvider = interactorProvider;
  }

  @Override
  public FriendProfilePresenter get() {
    return new FriendProfilePresenter(interactorProvider.get());
  }

  public static Factory<FriendProfilePresenter> create(
      Provider<FriendProfileInteractor> interactorProvider) {
    return new FriendProfilePresenter_Factory(interactorProvider);
  }
}
