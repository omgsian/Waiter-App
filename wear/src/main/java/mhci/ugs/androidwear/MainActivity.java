package mhci.ugs.androidwear;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.CardScrollView;
import android.support.wearable.view.WatchViewStub;
import android.view.Gravity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                CardScrollView cardScrollView =
                        (CardScrollView) findViewById(R.id.card_scroll_view);
                cardScrollView.setCardGravity(Gravity.BOTTOM);
            }
        });
    }
}
