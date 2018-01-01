package com.example.eissa.navigationdrawar.MainPresenter;

import android.app.Fragment;
import android.content.Context;

/**
 * Created by EISSA on 30/12/2017.
 */

public class MainPersenter<T> extends Fragment {

    public T context;

    public void onAttachView(T context){
        if(context != null)
        this.context = context;
    }

  public  void detachView(){
      this.context = null;
  }

  public boolean isdetachView(){
      return context==null;
  }

  public Context getContext()
  {
      return AppContext.getContext();
  }


}
