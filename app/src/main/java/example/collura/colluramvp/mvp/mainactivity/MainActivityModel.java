package example.collura.colluramvp.mvp.mainactivity;



public interface MainActivityModel {

    interface Network{
        void getNetworkdata();
        void networkDataCallback( String data );

    }

    interface Db{

    }

    interface Preferences{
        void getPreferencesdata();
        void preferencesDataCallback( String data );
    }

}