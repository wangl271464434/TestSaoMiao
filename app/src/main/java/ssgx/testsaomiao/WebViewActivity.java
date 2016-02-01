package ssgx.testsaomiao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class WebViewActivity extends Activity {

    @Bind(R.id.webView)
    WebView webView;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        ButterKnife.bind(this);
        intent = getIntent();
        String url = intent.getStringExtra("result");
        Toast.makeText(this,url,Toast.LENGTH_SHORT).show();
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        webSettings.setLoadWithOverviewMode(true);
        webView.loadUrl(url);
    }

}
