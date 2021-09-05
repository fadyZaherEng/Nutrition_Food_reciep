package com.example.taskapplication.ui.detailsActivity;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.taskapplication.Pogo.ResponseResult;
import com.example.taskapplication.data.NutritionClient;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class ModelViewMain extends ViewModel
{
    CompositeDisposable  disposable=new CompositeDisposable();
    MutableLiveData<ResponseResult> mutableLiveData=new MutableLiveData<>();
    public void GetData(String ingr)
    {
       Observable<ResponseResult> observable= NutritionClient.getINSTANCE()
               .GetData("1afb99c3","bc61ce11e9fea3a559dfcd326aeb59b5",ingr)
               .subscribeOn(Schedulers.io())
               .observeOn(AndroidSchedulers.mainThread());
        disposable.add(observable.subscribe(O->mutableLiveData.setValue(O)));
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        disposable.clear();
    }
}
