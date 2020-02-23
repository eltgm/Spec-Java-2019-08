package ru.otus.calleridclient.di;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import ru.otus.calleridclient.presentation.presenter.CategoriesPresenter;
import ru.otus.calleridclient.presentation.presenter.MainPresenter;
import ru.otus.calleridclient.presentation.presenter.SpamerInfoPresenter;

@Singleton
@Component(modules = {DataModule.class, AppModule.class})
public interface AppComponent {
    void injectMainPresenter(MainPresenter presenter);

    void injectCategoriesPresenter(CategoriesPresenter categoriesPresenter);

    void injectSpamerPresenter(SpamerInfoPresenter spamerInfoPresenter);

    Context provideContext();
}
