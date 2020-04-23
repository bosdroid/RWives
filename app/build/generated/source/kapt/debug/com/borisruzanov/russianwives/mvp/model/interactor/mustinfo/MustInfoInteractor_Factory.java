// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.borisruzanov.russianwives.mvp.model.interactor.mustinfo;

import com.borisruzanov.russianwives.mvp.model.repository.rating.RatingRepository;
import com.borisruzanov.russianwives.mvp.model.repository.slider.SliderRepository;
import com.borisruzanov.russianwives.mvp.model.repository.user.UserRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class MustInfoInteractor_Factory implements Factory<MustInfoInteractor> {
  private final Provider<SliderRepository> sliderRepositoryProvider;

  private final Provider<UserRepository> userRepositoryProvider;

  private final Provider<RatingRepository> ratingRepositoryProvider;

  public MustInfoInteractor_Factory(
      Provider<SliderRepository> sliderRepositoryProvider,
      Provider<UserRepository> userRepositoryProvider,
      Provider<RatingRepository> ratingRepositoryProvider) {
    this.sliderRepositoryProvider = sliderRepositoryProvider;
    this.userRepositoryProvider = userRepositoryProvider;
    this.ratingRepositoryProvider = ratingRepositoryProvider;
  }

  @Override
  public MustInfoInteractor get() {
    return new MustInfoInteractor(
        sliderRepositoryProvider.get(),
        userRepositoryProvider.get(),
        ratingRepositoryProvider.get());
  }

  public static Factory<MustInfoInteractor> create(
      Provider<SliderRepository> sliderRepositoryProvider,
      Provider<UserRepository> userRepositoryProvider,
      Provider<RatingRepository> ratingRepositoryProvider) {
    return new MustInfoInteractor_Factory(
        sliderRepositoryProvider, userRepositoryProvider, ratingRepositoryProvider);
  }
}
