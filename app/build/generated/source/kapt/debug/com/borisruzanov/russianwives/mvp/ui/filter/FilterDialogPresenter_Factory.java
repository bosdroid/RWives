// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.borisruzanov.russianwives.mvp.ui.filter;

import com.borisruzanov.russianwives.mvp.model.interactor.filter.FilterInteractor;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class FilterDialogPresenter_Factory implements Factory<FilterDialogPresenter> {
  private final Provider<FilterInteractor> interactorProvider;

  public FilterDialogPresenter_Factory(Provider<FilterInteractor> interactorProvider) {
    this.interactorProvider = interactorProvider;
  }

  @Override
  public FilterDialogPresenter get() {
    return new FilterDialogPresenter(interactorProvider.get());
  }

  public static Factory<FilterDialogPresenter> create(
      Provider<FilterInteractor> interactorProvider) {
    return new FilterDialogPresenter_Factory(interactorProvider);
  }
}