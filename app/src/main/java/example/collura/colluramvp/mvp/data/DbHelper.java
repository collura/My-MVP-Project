package example.collura.colluramvp.mvp.data;

import example.collura.colluramvp.mvp.mainactivity.MainActivityModel;
import example.collura.colluramvp.mvp.secondactivity.SecondActivityModel;

/**
 * Created by Betto on 26/03/2018.
 */

interface DbHelper extends
        MainActivityModel.Db
        ,SecondActivityModel.Db{}
