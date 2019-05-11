package com.mindorks.bootcamp.learndagger.ui;

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;
import com.mindorks.bootcamp.learndagger.utils.NetworkHelper;

import javax.inject.Inject;

public class HomeViewModel {
    private NetworkHelper networkHelper;
    private DatabaseService databaseService;
    private NetworkService networkService;
    @Inject
    public HomeViewModel(NetworkHelper networkHelper,DatabaseService databaseService,NetworkService networkService) {
        this.networkHelper = networkHelper;
        this.databaseService = databaseService;
        this.networkService = networkService;
    }

    public String fetchData(){
        return databaseService.getDummyData()+" : "+networkService.getDummyData()+"\n Network Connected :"+networkHelper.isNetworkConnected();
    }
}
